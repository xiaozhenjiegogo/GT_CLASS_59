/**
 * Project Name:dt59homework
 * File Name:TestTypeDefaultValue.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:05:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:05:00 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestTypeDefaultValue {

    public static void main(String[] args) {

        TypeDefaultValue tdv = new TypeDefaultValue();
        System.out.println(tdv.b); // 输出结果：0
        System.out.println(tdv.s); // 输出结果：0
        System.out.println(tdv.i); // 输出结果：0
        System.out.println(tdv.l); // 输出结果：0
        System.out.println(tdv.f); // 输出结果：0.0
        System.out.println(tdv.d); // 输出结果：0.0
        System.out.println(tdv.bool);// 输出结果：false
        System.out.println(tdv.ch); // 输出结果：空格
        System.out.println(tdv.str); // 输出结果：null
        System.out.println(tdv.ary); // 输出结果：null

    }

}
