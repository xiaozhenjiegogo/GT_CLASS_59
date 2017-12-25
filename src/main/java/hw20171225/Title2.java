/**
 * Project Name:dt59homework
 * File Name:Title2.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:34:59
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:34:59 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title2 {

    public static void main(String[] args) {

        Vipcard vip = new Vipcard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("你的VIP等级是：");
        String str = scanner.next();
        System.out.println("你的购物金额是：");
        double amount = scanner.nextDouble();
        System.out.println("打完折扣后的金额为：" + vip.cal(str, amount)); // 调用类方法后要用输出语句输出；
        scanner.close();
    }

}
