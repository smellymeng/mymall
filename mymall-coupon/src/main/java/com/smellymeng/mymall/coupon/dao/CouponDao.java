package com.smellymeng.mymall.coupon.dao;

import com.smellymeng.mymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-03 16:13:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
