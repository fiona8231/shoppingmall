package com.fiona.mall.production;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.fiona.mall.production.dao")
@SpringBootApplication
public class MallProductionApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallProductionApplication.class, args);
    }
}
