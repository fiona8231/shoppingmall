package com.fiona.mall.gataway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallGatawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallGatawayApplication.class, args);
	}

}
