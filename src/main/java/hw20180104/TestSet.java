/**
 * Project Name:dt59homework
 * File Name:TestSet.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:37:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:37:19 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestSet {
    private final static Logger LOG = Logger.getLogger(TestSet.class);

    public static void main(String[] args) {

        Set<Object> set = new TreeSet<Object>();// 构造一个空set，该Set自然排列；
        set.add("List");// 添加元素；
        set.add("Vivion");
        set.add("Exception");
        set.add("Over");
        set.add("Over");

        LOG.info(set);
        LOG.info(set.contains("li"));         // 查询set中是否包含此元素；
        LOG.info("删除" + set.remove("Over")); // 删除元素；
        LOG.info("这个集合里有" + set.size() + "个元素");
        Iterator<Object> itr = set.iterator();
        while (itr.hasNext()) {
            LOG.info(itr.next());
        }                               // 遍历发现set中的元素不能有重复；
        set.clear();                    // 清除所有元素；
        LOG.info(set.isEmpty());        // 判断set里是否没有元素；

    }

}
