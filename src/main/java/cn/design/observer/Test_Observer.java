package cn.design.observer;

import cn.hutool.json.JSONUtil;
import cn.hutool.log.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: XILIULOU
 * @description:  多种事件注册在事件管理器中,在需要做通知的时候,循环去通知就欧克,不影响主流程.
 * @author: Mr.YG
 * @create: 2021-03-02 17:42
 **/
@Slf4j
public class Test_Observer {
    public static void main(String[] args) {


        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        log.info("测试结果：{}", JSONUtil.toJsonStr(result));
    }
}
