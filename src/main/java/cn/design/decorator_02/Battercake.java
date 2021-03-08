package cn.design.decorator_02;

/**
 * @program: XILIULOU
 * @description: 煎饼类，继承了煎饼抽象类，一个煎饼 8 块钱
 * @author: Mr.YG
 * @create: 2021-03-08 16:53
 **/
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }
    @Override
    protected int cost() {
        return 8;
    }
}
