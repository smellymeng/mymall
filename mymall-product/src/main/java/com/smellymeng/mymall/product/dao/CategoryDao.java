package com.smellymeng.mymall.product.dao;

import com.smellymeng.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
