package com.smellymeng.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smellymeng.common.utils.PageUtils;
import com.smellymeng.mymall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

