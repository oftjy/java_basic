package com.itheima.ArrayListP;

import java.util.ArrayList;

public class 从集合中遍历元素且删除 {
    public static void main(String[] args) {
        ArrayList<Integer> scores =new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);
//        遍历scores

//        这种删除的方法是不对的，删除的时候，下标也会跟这变
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);
//            if(score<80){
//                scores.remove(i);
//            }
//        }
//        System.out.println(scores);
        for (int i = scores.size()-1; i >=0; i--) {//让i的初始值等于scores的长度,让他可变
             int score = scores.get(i);
             if(score<80){
                 scores.remove(i);
             }
        }
        System.out.println(scores);
//        解决方法2：每次删除后完了之后可以让i往后退一步  i--
    }
}
