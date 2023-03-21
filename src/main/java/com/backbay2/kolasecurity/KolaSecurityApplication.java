package com.backbay2.kolasecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class KolaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(KolaSecurityApplication.class, args);
    }

}
