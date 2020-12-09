package com.fiona.mall.coupon.dao;

import com.fiona.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 16:03:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
