package com.yong.orders.api.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yong.orders.api.client.BaseClient;
import com.yong.orders.api.client.UserApiClient;
import com.yong.orders.api.service.UserService;
import com.yong.orders.common.Result;
import com.yong.orders.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by yong.a.liang on 6/23/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController extends BaseController<User>{

    private UserService service;

    @Autowired
    public UserController(UserService service) {
        super(service);
        this.service=service;

    }

    @Override
    @GetMapping
    @HystrixCommand(fallbackMethod = "findAllFallback")
    public Result<List<User>> findtAll(
            HttpServletResponse response) {
        return service.findAll();
    }
    public Result<List<User>> findAllFallback(HttpServletResponse response){
        return Result.fail(3,"sorry,something error happen.");

    }

    @HystrixCommand(fallbackMethod = "findUserByDepartmentGroupFallback")
    @GetMapping("/departmentGroup/{departmentGroupId}")
    public Result<List<User>> findUserByDepartmentGroup(@PathVariable String departmentGroupId){
        return service.findUserByDepartmentGroup(departmentGroupId);
    }

    public Result<List<User>> findUserByDepartmentGroupFallback(@PathVariable String departmentGroupId){
        return Result.fail(3,"sorry,something error happen.");

    }

    @HystrixCommand(fallbackMethod = "findUserByDepartmentGroupAllFallback")
    @GetMapping("/departmentGroupHashMapAll")
    public Result<Map<String,List<String>>> findUserByDepartmentGroupAll(){
        return Result.success(service.findUserByDepartmentGroupAll());
    }

    public Result<Map<String,List<String>>> findUserByDepartmentGroupAllFallback(){
        return Result.fail(3,"sorry,something error happen.");

    }

    @HystrixCommand(fallbackMethod = "departmentGroupHashMapFallback")
    @GetMapping("/departmentGroupHashMap")
    public Result<Iterator<Map.Entry<String,String>>> findUserByDepartmentGroup(){
        return Result.success(service.findUserByDepartmentGroupMap());
    }

    public Result<Iterator<Map.Entry<String,String>>> departmentGroupHashMapFallback(){
        return Result.fail(3,"sorry,something error happen.");

    }

}
