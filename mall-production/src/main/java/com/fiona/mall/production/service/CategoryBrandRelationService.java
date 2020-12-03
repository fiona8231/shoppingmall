package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.common.utils.PageUtils;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

