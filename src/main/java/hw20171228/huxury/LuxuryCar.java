/**
 * Project Name:dt59homework
 * File Name:Bus.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午5:52:08
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午5:52:08 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class LuxuryCar extends Car {//不在同一个包里的方法需要导入
    private String people;
    private String brand;
    
    

    public void summary(String color,String type){
        this.setColor(color);
        this.setType(type);
        System.out.println("这是一辆"+getColor()+getType()+people+"才能开的豪华车！");
     }
   
    public String getPeople() {
        return people;
    }
    public void setPeople(String people) {
        this.people = people;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}

