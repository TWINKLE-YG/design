package cn.design.decorator;

/**
 * @program: XILIULOU
 * @description:
 * @author: Mr.YG
 * @create: 2021-03-08 16:25
 **/
public class Test_Decorator {
    public static void main(String[] args) {
        test_LoginSsoDecorator();
    }

    public static void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
}
