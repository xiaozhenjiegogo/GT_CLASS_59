/**
 * Project Name:dt59homework
 * File Name:TestString.java
 * Package Name:hw20180104.string
 * Date:2018年1月4日下午2:05:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:05:22 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestString {
    private final static Logger Log = Logger.getLogger(TestString.class);

    public static void main(String[] args) {
        // 注意：空格在字符串中也占一个位置；
        String str = " jenny Wu ";
        char ch = str.charAt(2); // 返回字符串中指定索引的char值；
        Log.info("jenny Wu的第三个字符为：" + ch);
        int num1 = str.indexOf('n'); // 返回指定字符在字符串中第一次出现的索引；
        Log.info("jenny Wu中n第一次出现在：第" + (num1 + 1) + "位");
        int num2 = str.length(); // 返回字符串的长度（空格也包括在内）;
        Log.info("jenny Wu的长度为：" + num2);
        Log.info("这个字符串为：" + "[" + str + "]");
        Log.info("返回的字符串为：" + "[" + str.trim() + "]");// 返回字符串副本，去掉头尾空格；
        String str1 = str.toUpperCase();// 将字符串中所有字符转换成大写；
        Log.info(str1);
        Log.info("这个新字符串为：" + str.replace(' ', '*'));// 用新的字符替代旧的字符返回的一个新字符串；

    }

}
