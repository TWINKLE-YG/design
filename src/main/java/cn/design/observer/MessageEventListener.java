package cn.design.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: XILIULOU
 * @description:   消息监听器
 * @author: Mr.YG
 * @create: 2021-03-02 17:09
 **/
@Slf4j
public class MessageEventListener implements EventListener {


    @Override
    public void doEvent(LotteryResult result) {
        log.info("给用户 {} 发送短信通知(短信)：{}", result.getUid(), result.getMsg());
    }

}