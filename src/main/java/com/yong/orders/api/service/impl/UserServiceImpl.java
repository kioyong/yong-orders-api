package com.yong.orders.api.service.impl;

import com.yong.orders.api.client.UserApiClient;
import com.yong.orders.api.service.UserService;
import com.yong.orders.api.service.impl.BaseServiceImpl;
import com.yong.orders.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yong.a.liang on 6/26/2017.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    private UserApiClient client;

    @Autowired
    public UserServiceImpl(UserApiClient client) {
        super(client);
        this.client = client;
    }
}
