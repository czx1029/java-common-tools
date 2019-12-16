package com.zeroten.common.util;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilsTest {
    @Test
    public void testSort(){
        int arr[] = new int[100];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(100);
        }
        System.out.println("排序前：" + Arrays.toString(arr));
        ArrayUtils.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
