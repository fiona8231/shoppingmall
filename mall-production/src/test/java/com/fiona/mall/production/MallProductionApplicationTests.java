package com.fiona.mall.production;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fiona.mall.production.entity.BrandEntity;
import com.fiona.mall.production.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductionApplicationTests {


   @Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("黑莓");
//		brandService.save(brandEntity);

//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(13l);
//		brandEntity.setDescript("小米");
//
//		brandService.updateById(brandEntity);


		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 12l));
        list.forEach((item)->{
			System.out.println(item);
		} );
	}

}
