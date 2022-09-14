package com.itheima.functionPrac;

import java.util.Random;

/**
 * 需求：定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 */
public class Test2 {
    public static void main(String[] args) {
        String res =CreateCode(8);
        System.out.println(res);
    }

    public static String CreateCode(int n) {
        String Code = "";//定义Code作为最后结果
        Random r = new Random();
        for (int i = 0; i < n; i++) {
//         声明随机数，范围三种类型，数字，大写小写字母
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char) (r.nextInt(26) + 65);//大写字符的取值范围
                    Code += ch;
                    break;
                case 1:
                    char ch1 = (char) (r.nextInt(26) + 97);//小写字符的取值范围
                    Code += ch1;
                    break;
                case 2:
                    Code += r.nextInt(10);
                    break;
            }
        }
        return Code;
    }
}

