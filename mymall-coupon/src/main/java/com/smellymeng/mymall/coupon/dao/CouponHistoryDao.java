package com.smellymeng.mymall.coupon.dao;

import com.smellymeng.mymall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-03 16:13:30
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
