package com.qianfeng.mysql_webservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qianfeng")
@MapperScan("com.qianfeng.dao")
public class MysqlWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlWebserviceApplication.class, args);
    }

}

