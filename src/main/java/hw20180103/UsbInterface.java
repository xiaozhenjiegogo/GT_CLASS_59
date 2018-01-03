/**
 * Project Name:dt59homework
 * File Name:UsbInterface.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:30:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午2:30:45 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */

public interface UsbInterface {
    
    public final static String SHAPE="长方形接口";//定义一些不可变的常量；
    
    public abstract void charge();
    public abstract String transform();
}

