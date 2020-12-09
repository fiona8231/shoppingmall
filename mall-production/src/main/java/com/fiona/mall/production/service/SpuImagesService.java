package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

