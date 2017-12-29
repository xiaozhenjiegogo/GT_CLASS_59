/**
 * Project Name:dt59homework
 * File Name:Pet.java
 * Package Name:hw20171228.title4
 * Date:2017年12月29日下午8:14:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.title4;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午8:14:53 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public abstract class Pet {
    private String name;
    private String color;
    private int age;
    
    public abstract void shout();
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
}

