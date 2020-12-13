package com.fiona.mall.production;

import com.aliyun.oss.OSSClient;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fiona.mall.production.entity.BrandEntity;
import com.fiona.mall.production.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

class MallProductionApplicationTests {


   @Autowired
	BrandService brandService;

    @Autowired
    OSSClient ossClient;

    @Test
	void contextLoads() throws FileNotFoundException {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("黑莓");
//		brandService.save(brandEntity);

//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(13l);
//		brandEntity.setDescript("小米");
//
//		brandService.updateById(brandEntity);

		InputStream inputStream = new FileInputStream("/Users/xuyue/Desktop/1.jpg");
		ossClient.putObject("dongsenshopingmall", "dongsen.jpg", inputStream);
		ossClient.shutdown();
		System.out.println("上传成功");


//		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 12l));
//        list.forEach((item)->{
//			System.out.println(item);
//		} );
	}

}
