package com.quick.start.pure.controller;

import com.quick.start.pure.pool.TestObject;
import com.quick.start.pure.pool.TestObjectPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    TestObjectPool testObjectPool;

    @GetMapping("/hello")
    public String hello() throws Exception {
        TestObject testObject = testObjectPool.borrowObject();

        return "world";
    }
}
