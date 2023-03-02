package com.itheima.ArrayListP;

import java.util.ArrayList;

public class ArrayList泛型 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//后面的泛型约束在1.7之后可以不写
        list.add("123");
//        list.add(123);报错
    }
}
