package cn.design.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: XILIULOU
 * @description: 父类定义方法执行顺序 子类实现  父类实现公共方法
 * @author: Mr.YG
 * @create: 2021-03-08 16:16
 **/
@Slf4j
public class Test_Template {
    public static void main(String[] args) {
        test_NetMall();
    }

    public static void test_NetMall() {
        NetMall netMall = new JDNetMall("1000001", "*******");
        String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        log.info("测试结果：{}", base64);
    }
}
