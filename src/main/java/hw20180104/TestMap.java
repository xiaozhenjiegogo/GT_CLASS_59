/**
 * Project Name:dt59homework
 * File Name:TestMap.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午4:37:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:37:31 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestMap {
    private final static Logger LOG = Logger.getLogger(TestMap.class);

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();// 默认初始容量为16；
        map.put(11, "赵");// 关联指定值和指定键；
        map.put(22, "钱");
        map.put(33, "孙");
        map.put(44, "李");
        map.put(55, "李");
        LOG.info(map.get(22));// 可以通过指定键找到指定值；
        LOG.info(map.containsKey(33));// 包含指定键映射的关系，就ture
        LOG.info(map.containsValue("吴"));// 包含指定值映射的关系，就true;
        LOG.info(map.size());// 映射键-值关系数
        map.remove(55);// 删除指定键的映射关系；

    }
}
