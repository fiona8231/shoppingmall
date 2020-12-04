package com.fiona.mall.member.dao;

import com.fiona.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yue
 * @email wahtever@gmail.com
 * @date 2020-12-04 16:47:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
