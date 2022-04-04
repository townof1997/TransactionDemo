package com.imooc.transactiondemo;

import com.imooc.transactiondemo.service.DemoService;
import com.imooc.transactiondemo.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TransactionDemoApplicationTests {

    @Autowired
    DemoService demoService;

    @Autowired
    MenuService menuService;

    @Test
    public void testWithoutTransaction() {
        demoService.addUser("tom");
    }

    @Test
    public void testCache() {
        System.out.println("call:" + menuService.getMenuList());

        System.out.println("call:" + menuService.getMenuList());

    }

    @Test
    void contextLoads() {
        System.out.println("call:" + menuService.getRecommends());
        System.out.println("call:" + menuService.getRecommends());
    }

}
