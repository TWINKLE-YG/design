package cn.design.strategy;

import java.math.BigDecimal;

/**
 * @program: XILIULOU
 * @description:N元购接口实现
 * @author: Mr.YG
 * @create: 2021-03-08 15:57
 **/
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }

}