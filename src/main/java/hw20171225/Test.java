/**
 * Project Name:dt59homework
 * File Name:Test.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午9:10:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午9:10:38 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class Test {
    
    public static void main(String[] args){
        Vipcard vip = new Vipcard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("你的VIP等级是：");//有一个bug,输入等级时错字了，输出金额默认为9.5折;不明白为什么？
        String str = scanner.next();
        System.out.println("你的购物金额是：");
        double amount = scanner.nextDouble();
        System.out.println("打完折扣后的金额为：" + vip.cal(str, amount)); // 调用类方法后要用输出语句输出；
        scanner.close();             
    }   
    String[] level = new String[] { "至尊级", "钻石级", "铂金级", "黄金级", "白银级" };
    int i;
    double cal(String str, double amount){      
       if(str.equals(level[i])){
           amount*=0.7+0.05*(i+1);
       }      
        return amount;
    }
}

