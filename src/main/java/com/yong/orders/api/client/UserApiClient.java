package com.yong.orders.api.client;

import com.yong.orders.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
/**
 * Created by yong.a.liang on 6/23/2017.
 */
@FeignClient(name = "yong-orders", path = "/user")
public interface UserApiClient extends BaseClient<User>{
}
