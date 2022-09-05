package com.smellymeng.coupon;

import com.smellymeng.mymall.coupon.entity.CouponEntity;
import com.smellymeng.mymall.coupon.service.CouponService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CouponTest {

    @Autowired
    CouponService couponService;

    @Test
    public void test1(){
        CouponEntity coupon = new CouponEntity();
        coupon.setStartTime(new Date());
        coupon.setCouponName("优惠劵");
        couponService.save(coupon);
        System.out.println("ok");
    }
}
