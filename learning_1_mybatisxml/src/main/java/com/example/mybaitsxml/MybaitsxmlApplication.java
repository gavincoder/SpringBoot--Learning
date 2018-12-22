package com.example.mybaitsxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybaitsxml.dao.mapper")
@SpringBootApplication()
public class MybaitsxmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsxmlApplication.class, args);
    }

}

