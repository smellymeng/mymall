package com.smellymeng.mymall.product.dao;

import com.smellymeng.mymall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
