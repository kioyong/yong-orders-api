package com.yong.orders.api.controller;

import com.yong.orders.api.service.BaseService;
import com.yong.orders.api.service.impl.OrdersServiceImpl;
import com.yong.orders.model.OrdersInfo;
import com.yong.orders.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiangYong on 2017/8/14.
 */
@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrdersController extends BaseController<OrdersInfo>{

    private OrdersServiceImpl service;

    public OrdersController(OrdersServiceImpl service) {
        super(service);
    }
}
