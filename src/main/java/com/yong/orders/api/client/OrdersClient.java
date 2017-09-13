package com.yong.orders.api.client;

import com.yong.orders.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by LiangYong on 2017/8/14.
 */
@FeignClient(name = "yong-orders", path = "/orders")
public interface OrdersClient extends BaseClient<User>{
}
