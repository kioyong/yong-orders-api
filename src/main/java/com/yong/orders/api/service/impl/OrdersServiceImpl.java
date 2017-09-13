package com.yong.orders.api.service.impl;

import com.yong.orders.api.client.BaseClient;
import com.yong.orders.api.client.OrdersClient;
import com.yong.orders.model.OrdersInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LiangYong on 2017/8/14.
 */
@Service
public class OrdersServiceImpl extends BaseServiceImpl<OrdersInfo> {

    private OrdersClient client;

    @Autowired
    public OrdersServiceImpl(OrdersClient client) {
        super(client);
    }
}
