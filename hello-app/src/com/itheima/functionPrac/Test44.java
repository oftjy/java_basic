package com.itheima.functionPrac;

/**
 * 需求：某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，
 * 然后每位数都加上5再对10求余，最后将所有数字反转，得到一串新数。
 */
public class Test44 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        pa(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void pa(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
