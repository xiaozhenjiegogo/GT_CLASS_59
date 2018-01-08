/**
 * Project Name:Jenny
 * File Name:ScannerThread.java
 * Package Name:Context
 * Date:2018年1月8日上午10:15:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:15:06 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class ThreadDemo extends Thread {
    private final static Logger Log = Logger.getLogger(ThreadDemo.class);

    private int num;

    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ThreadDemo(int num) {
        this.num = num;
    }

    public void run() {

        Log.info(level + num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
