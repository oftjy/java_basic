package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        Movie [] movies = new Movie[3];
        movies[0]=new Movie("长津湖",9.7,"吴京");
        movies[1]=new Movie("我和我的朋友",9.6,"吴京");
        movies[2]=new Movie("扑水少年",9.5,"王拥");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名："+m.getName());
            System.out.println("演员："+m.getActor());
            System.out.println("得分："+m.getScore());

        }
    }
}
