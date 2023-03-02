package com.itheima.ArrayListP;

import java.util.ArrayList;

public class ArrayList的常用Api {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySql");
        list.add("MyBatis");
        list.add("HTML");
//        1、public E get (int index)
//        获取某个位置索引的元素
        String e = list.get(3);
        System.out.println(e);
//        2、public int size () ; 获取集合的大小 （元素的个数）
        System.out.println(list.size());
//        3、完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        4、public boolean remove(int index)
//        直接删除某个索引位置处的元素，并返回被删除的元素
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
//        5、public boolean remove (Object o )
//        直接删除元素值，删除成功返回true，失败返回false
        System.out.println(list.remove("java"));
//        System.out.println(list.remove("Java"));

//        remove只会删除第一次出现的元素，不会继续往后删除
        System.out.println("------list的初始值---------");
        System.out.println(list);
        System.out.println("------list的删后值---------");
        list.remove("Java");
        System.out.println(list);
//      6、public E set （int index,E element): 修改某个索引位置处的元素值。
        String e3 = list.set(1,"okk");
        System.out.println(list);
    }
}
