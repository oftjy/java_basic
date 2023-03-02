package com.itheima.ArrayListP;

import java.util.ArrayList;

public class ArrayList电影集合 {
    public static void main(String[] args) {
        ArrayList<Movie>  movies= new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》",9.7 ,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6 , "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5 , "汤姆.汉克斯"));
        System.out.println(movies);//打印出来的是地址
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println(movie.getName());
            System.out.println(movie.getActor());
            System.out.println(movie.getScore());

        }
    }
}
