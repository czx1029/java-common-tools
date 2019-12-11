package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {

    @Test
    public void testisAnyEmpty(){
//      如果 strings 中有任意一个字符串为空，则返回 false，否则返回 true。
        Assert.assertEquals(CheckUtils.isAnyEmpty("s","d","a","d","f"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("s","d","a","d","f"," "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(" ","s","d","a","d","f"),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(" ","s","d","a","d","f"," "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(" "," "," "," ","s","d","a","d","f"," "," "," "," "," "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(" "," "," ","s","d","a"," "," "," ","d","f"," "," "," "),false);
        Assert.assertEquals(CheckUtils.isAnyEmpty("s","d","a"," "," "," ","d","f"," "," "," "),false);
    }

    @Test
    public void testisEmpty(){
//      判断引用类型数组是否为空，为空或 null 则返回 true，否则返回 false。

    }
}
