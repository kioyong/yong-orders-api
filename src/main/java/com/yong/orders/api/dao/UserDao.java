package com.yong.orders.api.dao;

import com.yong.orders.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by yong.a.liang on 6/26/2017.
 */
public interface UserDao extends MongoRepository<User,String> {
//    void removeAll();
//    void addAll(List<User> users);
}
