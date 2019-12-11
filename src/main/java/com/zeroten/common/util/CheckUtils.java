package com.zeroten.common.util;

import java.util.Arrays;

public class CheckUtils {
    public static boolean isAnyEmpty(String... strings) {
        String s1 = Arrays.toString(strings);
        System.out.println(s1);
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == " ") {
                return false;
            }
        }
        return true;
    }
}
