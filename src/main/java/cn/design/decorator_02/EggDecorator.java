package cn.design.decorator_02;

/**
 * @program: XILIULOU
 * @description: 鸡蛋装饰器，继承了抽象装饰类，鸡蛋装饰器在父类的基础上增加了一个鸡蛋，同时价格加上 1 块钱
 * @author: Mr.YG
 * @create: 2021-03-08 16:53
 **/
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    public void egg() {
        System.out.println("增加了一个鸡蛋");
    }
}
