/**
 * Project Name:dt59homework
 * File Name:Title6Class.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午5:31:45
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:31:45 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title6Class {
    static String teacher;

    String class1;

    String teacher2;

    public void teach(String class1) {
        this.class1 = class1;
        //teacher="包老师";
        //manage();在类里面类对象方法可以访问静态属性和静态方法；
        System.out.println(teacher2 + "教" + class1);
        
    }

    static public void manage() {
        
        // System.out.println("管理"+class1+"事务");static方法不能访问实例属性；
        System.out.println(teacher + "管理班级事务");// 可以直接访问静态属性；
    }
}
