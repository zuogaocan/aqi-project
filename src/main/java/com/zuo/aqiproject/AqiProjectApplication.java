package com.zuo.aqiproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.zuo.aqiproject.mapper")
public class AqiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AqiProjectApplication.class, args);
    }

}
