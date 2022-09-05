package com.smellymeng.mymall.order.dao;

import com.smellymeng.mymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 18:00:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
