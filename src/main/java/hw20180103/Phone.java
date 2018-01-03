/**
 * Project Name:dt59homework
 * File Name:Phone.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:02:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午4:02:43 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class Phone implements UsbInterface {

    public void charge(){
        System.out.println("手机充电中~~~~");
    }
    public String transform(){
        return "文件";
    }
}

