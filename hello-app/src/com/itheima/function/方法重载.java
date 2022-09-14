package com.itheima.function;

public class 方法重载 {
    //    同一个类中，多个方法的名称相同，形参列表不同
//    好处：对于相似的功能业务场景：可读性好，方法名称相同提示是同一类型的功能。通过形参不同实现功能差异化的选择，这是一种专业的代码设计
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire("岛国", 100);
    }

    public static void fire() {
        fire("米国");
    }

    public static void fire(String location) {
        fire(location, 1);
    }

    public static void fire(String location, int number) {
        System.out.println("默认发射" + number + "枚武器" + location);
    }
}
