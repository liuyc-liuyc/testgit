package com.lyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lyc.dao")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
        System.out.println("this is github");
    }
}
