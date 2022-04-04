package com.imooc.transactiondemo.dao;

import com.imooc.transactiondemo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
    Product findById(Long id);
}
