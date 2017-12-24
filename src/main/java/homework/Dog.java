/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:homework
 * Date:2017年12月24日下午1:39:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午1:39:02 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class Dog {

    public static void main(String[] args) {

       PetDog cupdog;
       cupdog=new PetDog();
       cupdog.name="茶杯犬";
       cupdog.color="白色";
       cupdog.variety="博美";
       cupdog.age="6个月";
       System.out.println("茶杯犬的别称为："+cupdog.name);
       System.out.println("茶杯犬的颜色为："+cupdog.color);
       System.out.println("茶杯犬的种类为："+cupdog.variety);
       System.out.println("茶杯犬的年纪为："+cupdog.age);
       System.out.println("茶杯犬的食物："+cupdog.eat());
       cupdog.shout();
       
    }

}

