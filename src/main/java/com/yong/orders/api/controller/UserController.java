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
import java.util.List;

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

}
