package com.itheima.ArrayListP;

import java.util.Scanner;

public class 验证用户名密码 {
    public static void main(String[] args) {
//        1、正确的用户名密码
        String okName ="itheima";
        String okPassword ="123456";
//        2、输入正确的用户名密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登录名称");
        String name= sc.next();
        System.out.println("登录密码");
        String pwd = sc.next();
//        3、判断输入的用户名和面是否相等
        if(okName.equals(name)&&okPassword.equals(pwd)){
            System.out.println("登录成功！");
        }else {
            System.out.println("用户名或者密码错误");
        }
//        4、忽略大小写比较内容的Api：一般用于比较验证码这样的业务逻辑
        String sysCode = "23AdFh";
        String code1 ="23aDfh";
        System.out.println(sysCode.equals(code1));
        System.out.println(sysCode.equalsIgnoreCase(code1));
    }
}
