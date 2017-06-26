package com.yong.orders.api.service;

import com.yong.orders.common.Result;

import java.util.List;

/**
 * Created by yong.a.liang on 6/26/2017.
 */
public interface BaseService<T> {
    Result<T> addOne(T instance);
    Result<T> delete(String id);
    Result<List<T>> findAll();
    Result<T> getOne(String id);
    Result<T> updateOne( T instance);
}
