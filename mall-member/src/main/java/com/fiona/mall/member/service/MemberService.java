package com.fiona.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiona.mall.common.utils.PageUtils;
import com.fiona.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 16:47:40
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

