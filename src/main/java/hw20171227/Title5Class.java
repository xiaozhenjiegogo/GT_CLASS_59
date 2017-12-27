/**
 * Project Name:dt59homework
 * File Name:Title5Class.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:23:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:23:19 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Title5Class {

    private String city;

    private String class1;

    private String lesson;

    public String getSchool() {
        return city;
    }

    public void setSchool(String city) {
        this.city = city;
        if (!city.equals("武汉")) {
            System.out.println("谢谢观看");
        } else {
            System.out.println("欢迎光临武汉北大青鸟！");
        }
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
        if (!class1.equals("Gt59班")) {
            System.out.println("欢迎光临北大青鸟！");
        } else {
            System.out.println("欢迎参加Gt59班开班仪式！");
        }
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
