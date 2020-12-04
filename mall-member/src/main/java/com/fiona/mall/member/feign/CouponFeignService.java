package com.fiona.mall.member.feign;

import com.fiona.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//这是一个声明式的远程调用
@FeignClient(name = "mall-coupon", url = "127.0.0.1:7000")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
