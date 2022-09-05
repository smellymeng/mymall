package com.smellymeng.mymall.product.dao;

import com.smellymeng.mymall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
