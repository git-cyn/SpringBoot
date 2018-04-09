package com.datajpa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/4/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

    @Autowired
    TestService testService;
    @Test
    public void findALL() throws Exception {
        System.out.println(testService.findALL()+"dddd");
    }

}