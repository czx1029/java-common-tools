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


    @Test
    public void testequals(){
//        判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。
        Assert.assertEquals(CheckUtils.equals("qwqwqw","qwqwqw"),true);
        Assert.assertEquals(CheckUtils.equals("qwqwqw","sdfsdfsdf"),false);
        Assert.assertEquals(CheckUtils.equals("","sdfsdfsdf"),false);
        Assert.assertEquals(CheckUtils.equals("qwqwqw",""),false);
        Assert.assertEquals(CheckUtils.equals("",""),false);

    }

    @Test
    public void testintequals(){
//        判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。
        Assert.assertEquals(CheckUtils.intequals(1,1),true);
        Assert.assertEquals(CheckUtils.intequals(1,2),false);
        Assert.assertEquals(CheckUtils.intequals(null,1),false);
        Assert.assertEquals(CheckUtils.intequals(1,null),false);
        Assert.assertEquals(CheckUtils.intequals(null,null),false);
    }
}
