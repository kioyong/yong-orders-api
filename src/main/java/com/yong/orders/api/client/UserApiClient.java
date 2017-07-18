package com.yong.orders.api.client;

import com.yong.orders.common.Result;
import com.yong.orders.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by yong.a.liang on 6/23/2017.
 */
@FeignClient(name = "yong-orders", path = "/user")
public interface UserApiClient extends BaseClient<User>{
    @GetMapping("/departmentGroup/{departmentGroupId}")
     Result<List<User>> findUserByDepartmentGroup(@PathVariable("departmentGroupId") String departmentGroupId);

    @GetMapping("/departmentGroupHashMapAll")
     Map<String,List<String>> findUserByDepartmentGroupAll();
    @GetMapping("/departmentGroupHashMap")
     Iterator<Map.Entry<String,String>> findUserByDepartmentGroup();

}
