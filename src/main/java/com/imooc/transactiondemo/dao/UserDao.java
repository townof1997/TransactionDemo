package com.imooc.transactiondemo.dao;

import com.imooc.transactiondemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
