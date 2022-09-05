package com.smellymeng.mymall.order.dao;

import com.smellymeng.mymall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 18:00:28
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
