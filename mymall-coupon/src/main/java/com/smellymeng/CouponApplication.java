package com.smellymeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.smellymeng.mymall.coupon.dao")
public class CouponApplication {

    /*
    * 整合mybatis-plus
    *
    * */
    public static void main(String[] args) {

        SpringApplication.run(CouponApplication.class,args);
    }
}
