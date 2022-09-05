package com.smellymeng.mymall.order.dao;

import com.smellymeng.mymall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 18:00:28
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
