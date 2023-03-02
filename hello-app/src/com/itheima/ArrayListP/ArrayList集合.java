package com.itheima.ArrayListP;

import java.util.ArrayList;

public class ArrayList集合 {
    public static void main(String[] args) {
//     正常的数组的长度是不可变的，（且类型是不可变的）不可以对其内部的长度进行改变，不可以加新的内容
//        在个数不确定，且要进行增删任务的时候，数组不太合适
//        1、创建ArrayList集合的对象
        ArrayList list = new ArrayList();
//        2、添加数据
        list.add("java");

        list.add("123");
        list.add("32");
        list.add("45");

        list.add(false);
        //add方法有返回值，代表是添加成功还是失败,但是一般情况下绝对不会添加失败
        System.out.println(list.add(false));
        System.out.println(list);
//        3、指定索引添加元素
        list.add(1,"哈喽小菜鸡");
        System.out.println(list);
    }
}
