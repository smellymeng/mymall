package com.smellymeng.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smellymeng.common.utils.PageUtils;
import com.smellymeng.mymall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author smellymeng
 * @email smellymeng@gmail.com
 * @date 2022-09-05 19:10:21
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

