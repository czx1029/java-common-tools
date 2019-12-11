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

    public static boolean equals(String str1, String str2) {
        System.out.println("str1 "+str1);
        System.out.println("str2 "+str2);
        if (str1==str2){
            if (str1!=""){
                return true;
            }
        }
        return false;
    }

    public static boolean intequals(Integer n1, Integer n2) {
        System.out.println("n1 "+ n1);
        System.out.println("n2 "+ n2);
        if (n1==n2){
            if (n1!=null){
                return true;
            }
        }
        return false;
    }
}
