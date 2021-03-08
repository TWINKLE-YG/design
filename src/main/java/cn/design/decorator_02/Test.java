package cn.design.decorator_02;

/**
 * @program: XILIULOU
 * @description:
 * @author: Mr.YG
 * @create: 2021-03-08 16:55
 **/
public class Test {
    public static void main(String[] args) {
        test_01();
        test_02();

    }

    /**
     * 购买一个煎饼
     */
    public static void test_01() {
        ABattercake aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
    }


    /**
     * 购买一个煎饼和一个鸡蛋
     */
    public static void test_02() {
//        ABattercake aBattercake = new Battercake();
//        aBattercake = new EggDecorator(aBattercake);
        ABattercake aBattercake = new EggDecorator(new Battercake());
        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
    }

    /**
     * 购买一个加两个鸡蛋的煎饼
     */
    public static void test_03() {

        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());

    }

    /**
     * 购买一个加两个鸡蛋和一根香肠的煎饼
     */
    public static void test_04() {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
    }


}
