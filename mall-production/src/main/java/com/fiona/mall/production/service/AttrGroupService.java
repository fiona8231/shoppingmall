package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

