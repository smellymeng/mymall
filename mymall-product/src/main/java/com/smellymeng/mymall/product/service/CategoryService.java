package com.smellymeng.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smellymeng.common.utils.PageUtils;
import com.smellymeng.mymall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

