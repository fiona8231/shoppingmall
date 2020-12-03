package com.fiona.mall.production.dao;

import com.fiona.mall.production.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
