package com.itheima.sanner;
//1、导包操作（并不需要自己写的，以后通过工具进行导入更方便）

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class 控制台键盘扫描 {
    public static void main(String[] args) {
//        2、得到一个扫描器对象
        Scanner sc = new Scanner(System.in);
//        3、调用sc对象的功能等待接收用户输入数据
//        这个代码会等待用户输入数据，知道用户输入完整的数据并按下了回车键就会把输入的数据拿到
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age);
        System.out.println("请您输入姓名：");
        String name = sc.next();
        System.out.println("欢迎：" + name);
    }
}
