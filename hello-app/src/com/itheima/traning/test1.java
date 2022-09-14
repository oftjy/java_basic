package com.itheima.traning;

public class test1 {
    //    找素数
    public static void main(String[] args) {
//        1、定义一个循环，找到100-200之间的所有数字
        for (int i = 101; i < 200; i++) {
//        2、设置一个标记，如果是素数，就把这个数输出
            boolean flag = true;
//        3、判断当前的数字是不是素数
//         让当前的数字与该数字的一半以内的所有数字进行整除，如果除的余数不是0，那么这个数字就是素数
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;//如果是false就代表不是素数
                    break;
                }
            }
            if (flag) {
                System.out.print(i + '\t');
            }

        }
    }
}
