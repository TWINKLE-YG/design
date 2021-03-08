package cn.design.chain;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.util.Date;

/**
 * @program: XILIULOU
 * @description: 通过Authlink  递归保存审核层级顺序(next),
 * @author: Mr.YG
 * @create: 2021-03-02 15:51
 **/

public class test_AuthLink {
    public static void main(String[] args) throws ParseException {
        Log log = LogFactory.get();
        //创建审核层级顺序
        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        log.info("测试结果：{}", JSONUtil.toJsonStr(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        log.info("测试结果：{}", "模拟三级负责人审批，王工");
        log.info("测试结果：{}", JSONUtil.toJsonStr(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        log.info("测试结果：{}", "模拟二级负责人审批，张经理");
        log.info("测试结果：{}", JSONUtil.toJsonStr(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        log.info("测试结果：{}", "模拟一级负责人审批，段总");
        log.info("测试结果：{}", JSONUtil.toJsonStr(authLink.doAuth("小傅哥", "1000998004813441", new Date())));
    }


}
