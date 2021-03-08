package cn.design.strategy;

import java.math.BigDecimal;

/**
 * @program: XILIULOU
 * @description:策略实现
 * @author: Mr.YG
 * @create: 2021-03-08 15:58
 **/
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}