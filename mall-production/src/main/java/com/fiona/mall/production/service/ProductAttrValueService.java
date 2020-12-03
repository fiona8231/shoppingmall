package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.common.utils.PageUtils;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

