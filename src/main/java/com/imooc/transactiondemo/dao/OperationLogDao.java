package com.imooc.transactiondemo.dao;

import com.imooc.transactiondemo.domain.OperationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationLogDao extends JpaRepository<OperationLog, Long> {
}
