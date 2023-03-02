package com.itheima.ArrayListP;

public class stringType {
    public static void main(String[] args) {

/*
        ArrayList代表的是集合类，集合是一种容器，与数组类似，不同的是集合的大小是不固定的

        String：字符串类型，可以定义字符串变量指向字符串对象
        String不可变字符的原因：String变量每次的修改其实都是产生并指向了新的字符串对象。
        原来的字符串对象都是没有改变的，所以称不可变字符串。
*/

//        创建String对象的方式：
//        1、直接使用双引号
        String name = "我爱你中国";
//        2、public String () 创建一个空白字符串对象，不含有任何内容（几乎不用）
        String s1 = new String();
//        3、public String(string) 根据传入的字符串内容，来创建字符串对象（几乎不用）
        String s2 = new String("我是中国人");
//        4、public String(char[] c) 根据字符数组的内容，来创建字符串对象
        char[] chars = {'a', 'b', '1', '中', '国'};
        String s3 = new String(chars);
        System.out.println(s3);
//        5、public String(byte [] b)根据字节数组的内容，来创建字符串对象
        byte[] bytes = {97, 98, 99, 65, 67};
        String s4 = new String(bytes);//将字节中的整数全部转换成单词字符串输出
        System.out.println(s4);

//        两种创建字符串的方法的区别：
//        以“”方式给出的字符串对象，在字符串常量池中存储，而且相同内容只会在其中存储一份
//        提供构造器new 对象，每new一个对象，放在堆内存中
//
        System.out.println("----------------------------");
        String ss1 ="abc";
        String ss2 ="abc";
        System.out.println(ss1==ss2);
        System.out.println("----------------------------");
        char [] chars1 ={'a','b','c','d'};
        String ss3 =new String(chars1);
        String ss4 =new String(chars1);
        System.out.println(ss3==ss4);
        System.out.println("面试题1----------------------");
        String aaa="abc";
        String bbb="ab";
        String ccc=bbb+"c";//变量的会放在堆内存，不指向同一个地址
        System.out.println(aaa==ccc);
        System.out.println("面试题2----------------------");
        String aa="abc";
        String bb="a"+"b"+"c";//Java内部存在编译优化机制，程序在编译时：“a"+"b"+"c"会直接转成”abc“
        System.out.println(aa==bb);
    }
}
