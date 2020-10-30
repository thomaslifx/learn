package com.boil.service.impl;

import com.boil.service.StudentService;
import com.boil.service.TestTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @author lifuxiang
 * @date 2020/10/29 15:50
 */
@Service
public class TestTransServiceImpl implements TestTransService {


    @Autowired
    private StudentService studentService;

    /**
     * 事务传播 - Propagation
     * REQUIRED            使用当前的事务，如果当前没有事务，则自己新建一个事务，
     *                     子方法是必须运行在一个事务中的；如果当前存在事务没做完加入这个事务，成为一个整体。
     *                     举例：领导没饭吃，我有钱，我会自己卖了自己吃，领导有的吃，会分给你一起吃
     * SUPPORTS            如果当前有事务，则使用事务，如果当前没有事务，则不使用事务
     *                     举例: 领导没有饭吃，我也没饭吃；领导有饭吃，我也有饭吃
     * MANDATORY           该传播属性强制必须存在一个事务，如果不存在，则抛出异常
     * REQUIRES_NEW        如果当前有事务，则挂起该事务，并且自己创建一个新的事务给自己使用
     *                     如果当前没有事务，则同 REQUIRED
     *                     举例: 领导有饭吃，我偏不要，我自己买了自己吃
     * NOT_SUPPORTED       如果当前有事务，则把事务挂起，自己不适用事务去运行数据库操作
     *                     举例: 领导给饭吃，自己太忙了，不吃
     * NEVER               如果当前有事务，则抛出异常
     * NESTED              如果当前有事务，则开启渍食物(嵌套事务)，嵌套事务是独立提交或者回滚
     *                     如果当期没有事务，则同REQUIRED
     *                     但是如果主事务提交，则会携带子事务一起提交
     *                     如果主事务回滚，则子事务会一起回滚，相反，子事务异常，则父事务可以回滚或者不回滚
     */

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void testPropagationTrans() {
        studentService.saveParent();
        studentService.saveChildren();
        //int a = 1 / 0;
    }
}
