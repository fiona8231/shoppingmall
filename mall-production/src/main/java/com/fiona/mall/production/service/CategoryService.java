package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

