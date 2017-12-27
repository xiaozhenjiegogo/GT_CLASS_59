/**
 * Project Name:dt59homework
 * File Name:Title3.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:51:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;



/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:51:31 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class Title3 {

    public static void main(String[] args) {
    
      //new Title3Class("张三",18,'男');  如果方法里面有输出语句，那么这里就可以直接new输出了。
        Title3Class t3c=new Title3Class("张三",18,'男');
        System.out.println(t3c.name+'\t'+t3c.age+'\t'+t3c.sex);       
    }

}

