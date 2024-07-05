package com.quick.start.pure;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = {"com.quick.start.pure"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}