package com.fiona.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 17:09:18
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

