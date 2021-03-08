package cn.design.decorator;

/**
 * 模拟spring拦截器
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}