package com.yong.orders.yongorders.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by yong.a.liang on 6/14/2017.
 */
@FeignClient(name = "yong-orders")
public interface IndexDefaultClient {

    @GetMapping("/info")
    String getInitInfo();

}