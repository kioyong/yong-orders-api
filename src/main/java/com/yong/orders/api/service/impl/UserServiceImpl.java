package com.yong.orders.api.service.impl;

import com.yong.orders.api.client.UserApiClient;
import com.yong.orders.api.dao.UserDao;
import com.yong.orders.api.service.UserService;
import com.yong.orders.api.service.impl.BaseServiceImpl;
import com.yong.orders.common.Result;
import com.yong.orders.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by yong.a.liang on 6/26/2017.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    private UserApiClient client;

    @Autowired
    public UserServiceImpl(UserApiClient client,UserDao userDao) {
        super(client);
        this.client = client;
    }

    public void addAll(List<User> users) {
        client.addAll(users);
    }

    public void removeAll() {

        client.deleteAll();
    }

    @Override
    public Result<List<User>> findUserByDepartmentGroup(String departmentGroupId) {
        return null;
    }

    @Override
    public Map<String, List<String>> findUserByDepartmentGroupAll() {
        return null;
    }

    @Override
    public Iterator<Map.Entry<String, String>> findUserByDepartmentGroupMap() {
        return null;
    }


}
