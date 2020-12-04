package com.fiona.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 17:15:58
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

