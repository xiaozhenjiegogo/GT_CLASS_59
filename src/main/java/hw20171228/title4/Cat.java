/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:hw20171228.title4
 * Date:2017年12月29日下午8:15:10
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.title4;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午8:15:10 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class Cat extends Pet{
     public void info(String name,String color,int age){
         this.setName(name);
         this.setColor(color);
         this.setAge(age);  
     }
       
     public void shout(){
        System.out.println("喵喵~~");    
    }
    @Override
    public void print() {//父类的abstract方法都得重写，否则此类就也是抽象类，需在类名前加abstract; 
        
         System.out.println("这只"+getColor()+"的猫咪叫："+getName()+","+getAge()+"岁了。");    
    }
}

