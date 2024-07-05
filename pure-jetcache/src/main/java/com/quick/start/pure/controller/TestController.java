package com.quick.start.pure.controller;

import com.alicp.jetcache.anno.Cached;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @Cached
    @GetMapping("/world")
    public String hello(@RequestParam("world") String world) {
        String abc = "123" + world;
        System.out.println("未使用缓存！");
        return abc;
    }
}
