package com.itheima.function;

public class test {
    public static void main(String[] args) {
        int res = sun(10);
        System.out.println(res);
        int []arr = {1,2,3,4,5};
        System.out.println(arrAum(arr));
    }

    public static int sun(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int arrAum (int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
