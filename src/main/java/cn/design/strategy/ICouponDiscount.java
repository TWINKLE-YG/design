package cn.design.strategy;

import java.math.BigDecimal;

/**
 * @program: XILIULOU
 * @description:优惠券接口
 * @author: Mr.YG
 * @create: 2021-03-08 15:56
 **/
public interface ICouponDiscount<T> {

    /**
     * 优惠券金额计算
     *
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return 优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}