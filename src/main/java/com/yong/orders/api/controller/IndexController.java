package com.yong.orders.api.controller;

import com.yong.orders.api.client.OrdersClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangYong
 * @createdDate 2017/11/4
 */
@RestController
public class IndexController {

	@Autowired
	private OrdersClient client;

	@GetMapping("/index")
	public String index(){
		return client.index();
	}
}
