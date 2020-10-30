package com.test;

import com.boil.Application;
import com.boil.service.StudentService;
import com.boil.service.TestTransService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description          测试类
 * @author lifuxiang
 * @date 2020/10/29 15:34
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
public class TransTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TestTransService testTransService;

    //@Test
    public void myTest() {
        testTransService.testPropagationTrans();
    }
}
