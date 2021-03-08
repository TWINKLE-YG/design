package cn.design.chain;

/**
 * @program: XILIULOU
 * @description:
 * @author: Mr.YG
 * @create: 2021-03-02 15:46
 **/

public class AuthInfo {

    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    // ...get/set

    @Override
    public String toString() {
        return "AuthInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}