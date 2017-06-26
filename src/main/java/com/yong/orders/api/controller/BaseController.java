package com.yong.orders.api.controller;


import com.yong.orders.api.service.BaseService;
import com.yong.orders.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yong.a.liang on 6/23/2017.
 */

public class BaseController<T> {
    private final static Logger LOG = LoggerFactory.getLogger(BaseController.class);

    private final BaseService service;

    public BaseController(BaseService service) {
        super();
        this.service = service;
    }


    @PostMapping("")
    Result<T> addOne(@RequestBody T instance,
                     HttpServletResponse response) {

        return service.addOne(instance);
    }


    @DeleteMapping("/{id}")
    public Result<T> delete(@PathVariable("id") String id,
                                HttpServletResponse response) {

        return service.delete(id);
    }


    @GetMapping
    public Result<List<T>> findtAll(
            HttpServletResponse  response) {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public Result<T> getOne(@PathVariable("id") String id,
                            HttpServletResponse  response) {

        return service.getOne(id);
    }


    @PutMapping("")
    Result<T> updateOne(@RequestBody T instance,
                        HttpServletResponse response) {

        return service.updateOne(instance);
    }
}