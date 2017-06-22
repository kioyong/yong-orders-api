package com.yong.orders.yongorders.controller;

import com.yong.orders.yongorders.EurekaConfig;
import com.yong.orders.yongorders.client.IndexDefaultClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yong.a.liang on 6/14/2017.
 */
@RestController
@CrossOrigin
@Import(EurekaConfig.class)
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IndexDefaultClient indexDefaultClient;

    @GetMapping("/info")
    public String getInitInfo(){
        return indexDefaultClient.getInitInfo();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return indexDefaultClient.save(user);
    }

}
