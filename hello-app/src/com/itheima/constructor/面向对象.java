package com.itheima.constructor;

public class 面向对象 {
    public static void main(String[] args) {
//        成员变量和局部变量的区别：   成员变量                局部变量
//        类中位置不同           类中                       常见于方法中
//        初始化值不同           有默认值，无需初始化         没有默认值，使用之前需要完成赋值
//        内存中的位置不同       属于堆内存中的变量           栈内存中的变量（所有方法都是在栈里面执行的）
//        生命周期不同           随着对象的创建而存在，       随着方法的调用而存在，随着方法的运行结束而消失
//                             随着对象的消失而消失
//        作用域不同             变量是属于这个对象的，只要   方法调用开始，一直到右大括号截止（也就是方法调用结束截止）
//                             创建了这个对象，就可以根据
//                             这个对象去访问


//        局部变量：
        double score =99.9;
        String name="123";
    }
    public class Student {
//        成员变量：
        private String name;//（属于每一个学生对象的name  age  所以在堆内存中存储
        private int age;
    }
}
