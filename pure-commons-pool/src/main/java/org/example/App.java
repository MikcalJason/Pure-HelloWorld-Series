package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        int i = absDivide(10, 3);
    }

    public static int absDivide(int m, int n) {
        if (m < n) {
            return 0;
        }
        return absDivide(m - n, n) + 1;
    }
}