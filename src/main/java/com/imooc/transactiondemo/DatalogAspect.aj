package com.imooc.transactiondemo;

import com.imooc.transactiondemo.anno.Datalog;
import com.imooc.transactiondemo.domain.ChangeItem;
import com.imooc.transactiondemo.domain.Product;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

//import java.util.logging.Logger;

@Aspect
@Component
public class DatalogAspect {

    private static final Logger logger = LoggerFactory.getLogger(Datalog.class);

//    @Autowired
//    ActionDao actionDao;

    @Pointcut("execution(public * com.imooc.transactiondemo.dao.*.save*(..))")
    public void save() {

    }

    @Pointcut("execution(public * com.imooc.transactiondemo.dao.*.delete*(..))")
    public void delete() {

    }

    @Around("save() || delete()")
    public Object addOperateLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("enter aspect");
        Class<?> cls = pjp.getTarget().getClass();
        Object service = pjp.getTarget();
        String methodName = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();

        Product p = new Product();

        Object returnObj = null;

        try{

            Object obj = args[0];
            String objectClass = obj.getClass().getName();

            //记录操作时间
            Date operateTime = new Date();


        }catch (Exception e) {
            logger.error("there is error when convert change item", e);

        } finally {

        }
//        Object oldObj = fin



        return p;
    }

//    public static List<ChangeItem> getChangeItems(Object oldObj, Object newObj) {
//
//    }


}
