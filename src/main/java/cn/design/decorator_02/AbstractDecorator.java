package cn.design.decorator_02;

/**
 * @program: XILIULOU
 * @description: 抽象装饰类，需要注意的是，抽象装饰类通过成员属性的方式将 煎饼抽象类组合进来，同时也继承了煎饼抽象类，且这里定义了新的业务方法 doSomething()
 * @author: Mr.YG
 * @create: 2021-03-08 16:53
 **/
public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }
    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
