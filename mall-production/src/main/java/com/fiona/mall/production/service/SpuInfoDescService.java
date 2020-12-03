package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

