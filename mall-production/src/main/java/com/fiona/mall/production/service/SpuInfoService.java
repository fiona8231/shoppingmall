package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.common.utils.PageUtils;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

