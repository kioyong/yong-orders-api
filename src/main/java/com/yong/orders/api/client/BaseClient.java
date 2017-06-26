package com.yong.orders.api.client;

import com.yong.orders.common.Result;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by yong.a.liang on 6/23/2017.
 */

public interface BaseClient<T> {

    @PostMapping
    Result<T> addOne(@RequestBody T instance);

    @DeleteMapping("/{id}")
    Result<T> delete(@PathVariable("id") String id);

    @GetMapping
    Result<List<T>> findAll();

    @GetMapping("/{id}")
    Result<T> getOne(@PathVariable("id") String id);

    @PutMapping
    Result<T> updateOne(@RequestBody T instance);
}