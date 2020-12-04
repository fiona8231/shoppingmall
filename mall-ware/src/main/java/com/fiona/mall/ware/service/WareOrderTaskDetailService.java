package com.fiona.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 17:15:59
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

