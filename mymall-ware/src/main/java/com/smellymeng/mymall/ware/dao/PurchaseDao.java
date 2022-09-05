package com.smellymeng.mymall.ware.dao;

import com.smellymeng.mymall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 16:42:37
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
