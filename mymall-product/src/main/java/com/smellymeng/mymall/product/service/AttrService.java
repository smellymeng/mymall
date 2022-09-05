package com.smellymeng.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smellymeng.common.utils.PageUtils;
import com.smellymeng.mymall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

