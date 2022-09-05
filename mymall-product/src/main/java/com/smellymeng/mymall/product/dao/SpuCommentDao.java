package com.smellymeng.mymall.product.dao;

import com.smellymeng.mymall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 17:34:20
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
