package com.fiona.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 16:03:29
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

