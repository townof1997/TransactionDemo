package com.imooc.transactiondemo.service;

import com.imooc.transactiondemo.dao.OperationLogDao;
import com.imooc.transactiondemo.dao.UserDao;
import com.imooc.transactiondemo.domain.OperationLog;
import com.imooc.transactiondemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * @program: com.imooc.transactiondemo.service
 * @description:
 * @author: 86138_town
 * @create date: 2022/4/4 19 03
 */

@Component
public class DemoService {
    @Autowired
    UserDao userDao;

    @Autowired
    OperationLogDao operationLogDao;

    @Transactional//这里有几个参数自己上网查
    public void addUser(String name) {

        OperationLog log = new OperationLog();
        log.setContent("create user:" + name);
        operationLogDao.save(log);

        User user = new User();
        user.setName(name);
        userDao.save(user);

    }
}
