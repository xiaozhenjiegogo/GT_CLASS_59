/**
 * Project Name:dt59homework
 * File Name:Title6.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午5:31:17
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:31:17 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title6 {

    public static void main(String[] args) {
        /*
         * 静态属性：teacher 静态方法：manage() 
         * 实例属性：class1 类对象方法：teach(class);
         */

        Title6Class t6c = new Title6Class();
        t6c.class1 = "Java班";
        t6c.teacher2 = "包老师";
        System.out.println(t6c.class1);
        t6c.teach("Java班");

        // 1. 类对象可以直接访问静态属性和静态方法，可以输出:（但会出警告）
        // t6c.teacher="包老师";
        // t6c.manage();
        // 2. 不能通过类名直接访问实例属性和类对象方法：
        // Title6Class.class1="Java班";
        // Title6Class.teach("Java班");
        Title6Class.teacher = "朱老师";
        System.out.println(Title6Class.teacher);
        Title6Class.manage();
    }

}
