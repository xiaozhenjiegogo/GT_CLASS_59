/**
 * Project Name:dt59homework
 * File Name:TestListMethod.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:17:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:17:07 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class TestList {
    private final static Logger LOG = Logger.getLogger(TestList.class);

    public static void main(String[] args) {
        // List是个接口，ArrayList是List的实现类；
        List<Object> list = new ArrayList<Object>();// 初始容量为10;
        list.add("小珍姐");// 将指定的元素添加到此列表的尾部；
        list.add("北大青鸟");
        list.add(59);
        LOG.info("list里有：" + list.size() + "个元素；");// 返回此列表的元素数；
        list.add(1, "武汉");// 在指定位置加入元素；
        LOG.info("第2个元素为：" + list.get(1));// 返回此列表中指定位置的元素；
        LOG.info("第3个元素为：" + list.get(2));
        list.remove(1);// 移除指定位置的元素；删除了“武汉”；
        LOG.info("第2个元素为：" + list.get(1));
        LOG.info("第3个元素为：" + list.get(2));
        list.set(1, "上海");// 将指定元素添加到指定位置；修改了此位置的元素；“北大青鸟”改为“上海”；
        LOG.info("第2个元素为：" + list.get(1));
        LOG.info("第3个元素为：" + list.get(2));
        LOG.info(list);
        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()) {// 遍历此列表；
            LOG.info(itr.next());
        }
    }

}
