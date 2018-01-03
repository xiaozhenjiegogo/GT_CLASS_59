/**
 * Project Name:dt59homework
 * File Name:TestPhone.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:13:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:13:58 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestPhone {

    public static void main(String[] args) {

        UsbInterface usb = new Phone();
        usb.charge();
        System.out.println("USB接口可以传输" + usb.transform());
    }

}
