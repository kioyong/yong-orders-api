package com.yong.orders.yongorders.client;

import com.yong.orders.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by yong.a.liang on 6/14/2017.
 */
@FeignClient(name = "yong-orders")
public interface IndexDefaultClient {

    @GetMapping("/info")
    String getInitInfo();

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user);

}