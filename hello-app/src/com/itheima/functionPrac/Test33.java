package com.itheima.functionPrac;

/**
 * 需求：把一个数组中的元素复制到另一个新数组中去。
 */
public class Test33 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44};
        int[] arr2 = new int[arr1.length];
        cp(arr1, arr2);
        pa(arr1);
        pa(arr2);
    }

    public static void pa(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    public static void cp(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

}
