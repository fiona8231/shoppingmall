package com.fiona.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 17:15:59
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

