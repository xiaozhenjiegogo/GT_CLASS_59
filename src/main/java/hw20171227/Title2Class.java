/**
 * Project Name:dt59homework
 * File Name:Title2Class.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:21:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:21:46 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title2Class {
    String kind = "SUV";

    String brand = "丰田";

    String color = "黑色";

    public Title2Class() {
        System.out.println("车型：" + kind);
        System.out.println("品牌：" + brand);
        System.out.println("颜色：" + color);
        System.out.println();
        kind = "跑车";
        brand = "奔驰";
        color = "白色";
        System.out.println("车型：" + kind);
        System.out.println("品牌：" + brand);
        System.out.println("颜色：" + color);
    }

}
