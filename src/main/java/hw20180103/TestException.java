/**
 * Project Name:dt59homework
 * File Name:TestException.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:15:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:15:50 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestException {

     private static final Logger Log=Logger.getLogger(TestException.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("请输入一个字符串：");
 
        Log.info("请输入一个字符串：");
        try {
            String str = scanner.next();          
            if (str.length() < 5) {
                throw new Exception("你输入的字符长度有误！");               
            }
        } catch (Exception e) {
            Log.info("请重新输入："); 
           
            e.printStackTrace();
        } finally {
            
            scanner.close();
            
        }
       

    }
}
