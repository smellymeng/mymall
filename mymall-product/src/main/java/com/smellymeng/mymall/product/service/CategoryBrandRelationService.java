package com.smellymeng.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smellymeng.common.utils.PageUtils;
import com.smellymeng.mymall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

