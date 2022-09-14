package com.itheima.constructor;

public class demo {
    public static void main(String[] args) {
        User u1 =new User();
        u1.setName("吴彦祖");
        u1.setHeight(170.1);
        u1.setSalary(20000);

        System.out.println(u1.getName());
        System.out.println(u1.getSalary());
        System.out.println(u1.getHeight());

        User u2 = new User("123",150,10000);
        System.out.println(u2.getHeight());
        System.out.println(u2.getName());
        System.out.println(u2.getSalary());

    }
}
