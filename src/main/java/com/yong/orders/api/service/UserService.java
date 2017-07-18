package com.yong.orders.api.service;

import com.yong.orders.common.Result;
import com.yong.orders.model.User;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by yong.a.liang on 6/26/2017.
 */

public interface UserService extends BaseService<User>{
    void addAll(List<User> users);
    void removeAll();

    Result<List<User>> findUserByDepartmentGroup(String departmentGroupId);
    Map<String,List<String>> findUserByDepartmentGroupAll();
    Iterator<Map.Entry<String,String>> findUserByDepartmentGroupMap();

}
