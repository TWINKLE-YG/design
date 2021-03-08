package cn.design.strategy;

import java.math.BigDecimal;

/**
 * @program: XILIULOU
 * @description:直减接口实现
 * @author: Mr.YG
 * @create: 2021-03-08 15:56
 **/
public class ZJCouponDiscount implements ICouponDiscount<Double> {

    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }

}