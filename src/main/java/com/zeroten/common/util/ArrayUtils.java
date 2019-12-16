package com.zeroten.common.util;

public class ArrayUtils {
    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        return arr;
    }
}
