package com.itheima.functionPrac;

/**
 * 需求：找出101-200之间的素数输出：
 * 素数是什么：如果除了1和它本身以外，不能被其他正整数整除，就叫素数。
 */
public class Test1 {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i++) {
//            拿到100-200的数字
//            让当前的数字跟从2开始到自己的一半取余，如果取得余数是0那么就是代表可以整除，就不是素数

            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;//当找到的时候就不能再往下继续遍历了，因为
                }
            }
            if (flag) {
                System.out.print(i + "\t");
            }
        }
    }
}
