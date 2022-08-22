package com.itheima.operator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 数组的遍历 {
    public static void main(String[] args) {
        int[] ages = {20, 30, 40};
        for (int k = 0; k < ages.length;
             k++) {
            System.out.println(ages[k]);
        }
//        猜字游戏
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(21);
        }
        System.out.println(Arrays.toString(nums));
        int res = 0;
        OUT:
        while (true) {
            res = sc.nextInt();
            for (int i = 0; i < nums.length; i++) {
                if (res == nums[i]) {
                    System.out.println("猜中了");
                    break OUT;// 结束了整个死循环，代表游戏结束了！
                }
            }
            System.out.println("未命中");
        }
    }
}
