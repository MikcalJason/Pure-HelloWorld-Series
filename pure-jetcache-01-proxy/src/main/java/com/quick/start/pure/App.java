package com.quick.start.pure;


import com.quick.start.proxy.EnableAutoProxyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoProxyConfig
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}