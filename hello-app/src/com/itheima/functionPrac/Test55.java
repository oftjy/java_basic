package com.itheima.functionPrac;

import java.util.Random;
import java.util.Scanner;

public class Test55 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] locakMoney = new int[arr.length];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("开始抽奖");
            sc.nextInt();
            while (true) {
                int index = r.nextInt(arr.length);
                boolean flag = true;
                int CurrentMoney= arr[index];
                for (int j = 0; j < locakMoney.length; j++) {
                    if (CurrentMoney == locakMoney[j]) {
                        flag = false;
                        System.out.println(CurrentMoney+"奖项被抽走啦");
                        break;
                    }
                }
                if(flag){
                    System.out.println(CurrentMoney+"被抽中了");
                    locakMoney[i]=CurrentMoney;
                    break;
                }
            }
        }
    }

}
