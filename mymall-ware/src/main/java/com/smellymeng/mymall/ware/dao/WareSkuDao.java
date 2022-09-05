package com.smellymeng.mymall.ware.dao;

import com.smellymeng.mymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 16:42:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
