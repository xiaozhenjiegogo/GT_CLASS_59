/**
 * Project Name:Jenny
 * File Name:TestRunnable.java
 * Package Name:Context
 * Date:2018年1月8日上午11:02:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;


/**
 * Description: <br/>
 * Date: 2018年1月8日 上午11:02:08 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestRunnable {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            ImpRunnable ir = new ImpRunnable(i);
            Thread th = new Thread(ir);
            th.run();

        }

    }
}
