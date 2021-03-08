package cn.design.decorator_02;

/**
 * @program: XILIULOU
 * @description: 香肠装饰器，与鸡蛋装饰器类似，继承了抽象装饰类，给在父类的基础上加上一根香肠，同时价格增加 2 块钱
 * @author: Mr.YG
 * @create: 2021-03-08 16:54
 **/
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }
    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }
    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}