package com.yong.orders.api.service.impl;

import com.yong.orders.api.client.BaseClient;
import com.yong.orders.api.service.BaseService;
import com.yong.orders.common.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yong.a.liang on 6/26/2017.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private final BaseClient baseClient;

    @Autowired
    public BaseServiceImpl(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    @Override
    public Result<T> addOne(T instance) {
        return baseClient.addOne(instance);
    }

    @Override
    public Result<T> delete(String currencyId) {
        return baseClient.delete(currencyId);
    }

    @Override
    public Result<List<T>> findAll() {
        return baseClient.findAll();
    }

    @Override
    public Result<T> getOne(String currencyId) {
        return baseClient.getOne(currencyId);
    }

    @Override
    public Result<T> updateOne(T instance) {
        return baseClient.updateOne(instance);
    }
}
