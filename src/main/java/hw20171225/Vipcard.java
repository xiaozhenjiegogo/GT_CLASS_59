/**
 * Project Name:dt59homework
 * File Name:Vipcard.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:35:48
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:35:48 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Vipcard {

    String[] level = new String[] { "至尊级", "钻石级", "铂金级", "黄金级", "白银级" };

    double cal(String str, double amount) {//参数str对应键盘输入等级；amount对应折扣后的金额；
        if (str.equals(level[0])) {       //最初以为设定的所有参数的数据类型必须和类方法的数据类型一致；
            amount *= 0.75;
        } else if (str.equals(level[1])) {
            amount *= 0.8;
        } else if (str.equals(level[2])) {
            amount *= 0.85;
        } else if (str.equals(level[3])) {
            amount *= 0.9;
        } else {
            amount *= 0.95;
        }
        return amount;
    }
}
