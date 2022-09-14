package com.itheima.functionPrac;

import java.util.Random;

/**
 * 1、定义一个方法返回一个随机验证码：是否需要返回值类型申明？String  是否需要申明形参：int n
 */
public class Test22 {
    public static void main(String[] args) {
       String res= CreateCode(8);
        System.out.println(res);
    }

    public static String CreateCode(int n) {
        String Code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    Code += (char) (r.nextInt(26) + 65);
                    break;
                case 1:
                    Code += (char) (r.nextInt(26) + 97);
                    break;
                case 2:
                    Code += r.nextInt(10);
                    break;
            }
        }
        return Code;
    }
}
