package cn.design.chain;

import lombok.Data;

/**
 * @program: XILIULOU
 * @description:
 * @author: Mr.YG
 * @create: 2021-03-02 15:46
 **/
@Data
public class AuthInfo {

    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
    }

}