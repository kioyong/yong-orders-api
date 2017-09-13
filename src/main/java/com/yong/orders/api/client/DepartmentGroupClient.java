package com.yong.orders.api.client;

import com.yong.orders.model.OrdersInfo;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by LiangYong on 2017/8/14.
 */
@FeignClient(name = "yong-orders", path = "/departmentGroup")
public interface DepartmentGroupClient extends BaseClient<OrdersInfo>{
}
