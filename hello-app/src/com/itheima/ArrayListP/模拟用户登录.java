package com.itheima.ArrayListP;

import java.util.Scanner;

public class 模拟用户登录 {
    public static void main(String[] args) {
        // 1、定义正确的登录名称和密码
        String AcNum = "123123";
        String pwd = "123123";
        // 2、定义一个循环，循环3次让用户登录
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号");
            String inputAcNum = sc.next();
            System.out.println("请输入密码");
            String inputPwd = sc.next();
            if (inputAcNum.equals(AcNum)) {
                if (inputPwd.equals(pwd)) {
                    System.out.println("账号密码都正确");
                    break; //当账号密码都正确的时候，需要跳出循环
                } else {
                    System.out.println("密码错误剩余输入次数" + (2 - i) + "次");
                }
            } else {
                System.out.println("账号错误剩余输入次数" + (2 - i) + "次");
            }
        }
    }
}
