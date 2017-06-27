package com.yong.orders.api.schedule;

import com.yong.orders.api.service.UserService;
import com.yong.orders.common.Result;
import com.yong.orders.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yong.a.liang on 6/26/2017.
 */

@Component
public class SyncConfigurationDataTask {
    private static final Logger log = LoggerFactory.getLogger(SyncConfigurationDataTask.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private UserService userService;

    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        SyncUserData();
    }

    public void SyncUserData(){
        try{
            Result<List<User>> result = userService.findAll();
            List<User> users = result.getPayload();
            log.info("start removeAll User config data");
            userService.removeAll();
            log.info("start addAll User config data");
            userService.addAll(users);
        }catch(Exception err){
            log.error(err.getMessage());
        }

    }

}
