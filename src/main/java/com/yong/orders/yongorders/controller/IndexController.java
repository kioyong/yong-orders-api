package com.yong.orders.yongorders.controller;

import com.yong.orders.yongorders.EurekaConfig;
import com.yong.orders.yongorders.client.IndexDefaultClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
