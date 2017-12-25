/**
 * Project Name:dt59homework
 * File Name:Title1.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:20:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:20:49 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
        Title1 max = new Title1();
        System.out.println(max.max(a, b) + "大！");// 此处声明的变量max和方法max不会冲突吗？
        //调用有返回值的类方法需要用输出语句输出，而无返回值的则不需要；直接调用；
        scanner.close();
    }

    int max(int a, int b) {
        if (a > b) {
            // System.out.println("");有返回值方法里面是否不能直接用输出语句？
            return a;// 调用此方法时值为a,需要用输出语句将它输出;
        } else {
            return b;
        }
    }
}
// 刚开始不知道怎么用参数，从哪下手，通过做题才知道一点用法；

