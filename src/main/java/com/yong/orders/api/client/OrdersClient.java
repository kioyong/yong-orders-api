package com.yong.orders.api.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiangYong
 * @createdDate 2017/11/4
 */
@FeignClient("yong-orders")
public interface OrdersClient {

	@GetMapping("/index")
	String index();
}
