package com.sgq.jwt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sgq.jwt.dao")
public class JwtApplication {

    public static void main(String[] args) {
        System.out.println("点击调用:  http://localhost:8081/user/login");
        SpringApplication.run(JwtApplication.class, args);
    }

}
