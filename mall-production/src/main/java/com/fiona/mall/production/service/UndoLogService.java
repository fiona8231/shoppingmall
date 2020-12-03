package com.fiona.mall.production.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.common.utils.PageUtils;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.production.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-03 22:35:02
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

