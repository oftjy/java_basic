package com.itheima.operator;

import java.util.Arrays;

public class 静态数组 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};//数字的数组
        System.out.println(Arrays.toString(arr));//打印的时候数组不可以直接打印，需要转换成字符串才可以
        String[] names = {"牛二", "西门", "全蛋"};//字符串的数组
        System.out.println(Arrays.toString(names));
//        1.数据类 [] 数组名 可写成  数据类型 数组名 []
        int arr1 []={1,2,3,4};
//        2.什么数据类型的数组只能存放什么类型的数组
//        3.数组一旦定义出来之后，类型和长度就不可以改变了

    }
}
