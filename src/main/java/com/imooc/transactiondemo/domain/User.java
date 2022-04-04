package com.imooc.transactiondemo.domain;

import javax.persistence.*;

/**
 * @program: com.imooc.transactiondemo.domain
 * @description:
 * @author: 86138_town
 * @create date: 2022/4/4 19 06
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
