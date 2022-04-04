package com.imooc.transactiondemo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @program: com.imooc.transactiondemo.service
 * @description:
 * @author: 86138_town
 * @create date: 2022/4/4 19 57
 */
@Component
public class MenuService {

    @Cacheable(cacheNames = {"menu"})
    public List<String> getMenuList() {
        System.out.println("00");
        System.out.println("mock:get from db");
        return Arrays.asList("article", "comment", "admin");
    }

    public List<String> getRecommends() {
        return this.getMenuList();//这里的this不是织入的bean，所以没有效果
//        ApplicationContextInitializer.
//        MenuService proxy = ApplicationContextHolder App.getContext().getBean(MenuService.class);
//        return proxy.getMenuList();
    }

}
