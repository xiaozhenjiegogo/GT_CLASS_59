/**
 * Project Name:Jenny
 * File Name:TestThread.java
 * Package Name:Context
 * Date:2018年1月8日上午10:14:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;


/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:14:20 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestThread {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            ThreadDemo st = new ThreadDemo(i);
            if (i % 50 == 0) {
                st.setPriority(Thread.MAX_PRIORITY);
                st.setLevel("黑卡：");
            } else if (i % 20 == 0) {
                st.setLevel("VIP:");
            } else {
                st.setLevel("普通用户：");
                st.setPriority(Thread.MIN_PRIORITY);
            }
            st.start();
        }

    }
}
