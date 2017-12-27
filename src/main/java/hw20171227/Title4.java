/**
 * Project Name:dt59homework
 * File Name:Title4.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:29:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:29:32 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title4 {

    public static void main(String[] args) {

        Title4Class object1 = new Title4Class( "时尚女郎","大波浪卷发");
        System.out.println(object1.hair + "的" + object1.lady + "优雅地喝着咖啡。");
        Title4Class object2 = new Title4Class("单眼皮","家庭主妇", "马尾");//相同数据类型的参数可以改变位置，不影响值的输出；
        System.out.println("一个扎着" + object2.hair + "的" + object2.eyes + object2.lady + "正在做着家务。");
        Title4Class object3 = new Title4Class("学生", "大眼睛","bob头",16);
        System.out.println("一个" + object3.age + object3.hair + "的" + object3.eyes + object3.lady + "正在看书。");

    }
}
