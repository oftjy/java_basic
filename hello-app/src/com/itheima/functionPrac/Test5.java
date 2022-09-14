package com.itheima.functionPrac;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] money = {2, 588, 888, 1000, 10000};
        int[] lockmoney = new int[money.length];

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < money.length; i++) {
            System.out.println("开始抽奖");
            sc.nextInt();
            while (true) {
                int index = r.nextInt(money.length);
                int CurrentMoney = money[index];

                boolean flag = true;//代表没被抽中
                for (int j = 0; j < lockmoney.length; j++) {
                    if (CurrentMoney == lockmoney[j]) {
                        flag = false;//跳出当前的while循环11
                        System.out.println(CurrentMoney + "奖项被抽走了");
                        break;
                    }
                }
                if (flag) {
                    System.out.println("抽中了" + CurrentMoney);
                    lockmoney[i] = CurrentMoney;
                    break;
                }
            }
        }
    }
}
