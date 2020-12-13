package com.fiona.mall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@EnableDiscoveryClient
@SpringBootTest
class MallThirdPartyApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(MallThirdPartyApplication.class, args);
	}
	@Resource
	OSSClient ossClient;

   @Test
	void contextLoads() throws FileNotFoundException {


		InputStream inputStream = new FileInputStream("/Users/xuyue/Desktop/3.jpg");
		ossClient.putObject("dongsenshopingmall", "huayuan.jpg", inputStream);
		ossClient.shutdown();
		System.out.println("上传成功");



	}

}
