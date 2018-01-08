/**
 * Project Name:Jenny
 * File Name:TestRunnable.java
 * Package Name:Context
 * Date:2018年1月8日上午10:43:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:43:23 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class ImpRunnable implements Runnable {

    public int num;

    public ImpRunnable(int num) {
        this.num = num;
    }

    public void run() {

        System.out.println("正在运行" + num);
    }

}
