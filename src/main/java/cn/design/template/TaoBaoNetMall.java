package cn.design.template;

import cn.hutool.core.codec.Base64Encoder;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: XILIULOU
 * @description:淘宝爬虫
 * @author: Mr.YG
 * @create: 2021-03-08 16:13
 **/
@Slf4j
public class TaoBaoNetMall extends NetMall {

    public TaoBaoNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    public Boolean login(String uId, String uPwd) {
        log.info("模拟淘宝用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    public Map<String, String> reptile(String skuUrl) {
        String str = HttpUtil.get(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        if (m9.find()) {
            map.put("name", m9.group());
        }
        map.put("price", "4799.00");
        log.info("模拟淘宝商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    public String createBase64(Map<String, String> goodsInfo) {
        Base64Encoder encoder = new Base64Encoder();
        log.info("模拟生成淘宝商品base64海报");
        return encoder.encode(JSONUtil.toJsonStr(goodsInfo).getBytes());
    }

}