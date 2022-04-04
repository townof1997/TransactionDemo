package com.imooc.transactiondemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.imooc.transactiondemo.controller
 * @description:
 * @author: 86138_town
 * @create date: 2022/4/4 19 43
 */
@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/common")
    public String commonAccess() {
        return "only login can view";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String admin() {
        return "only admin can access";
    }

}
