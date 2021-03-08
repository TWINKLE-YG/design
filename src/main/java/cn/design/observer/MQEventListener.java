package cn.design.observer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: XILIULOU
 * @description:  mq监听器
 * @author: Mr.YG
 * @create: 2021-03-02 17:10
 **/
@Slf4j

public class MQEventListener implements EventListener {


    @Override
    public void doEvent(LotteryResult result) {
        log.info("记录用户 {} 摇号结果(MQ)：{}", result.getUid(), result.getMsg());
    }
}
