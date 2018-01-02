/**
 * Project Name:dt59homework
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:28:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午5:28:06 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {
        
       Pet dog=new Dog();
       Pet cat=new Cat();
       Pet rabbit=new Rabbit();
   
       dog.setName("小白");
       cat.setName("MiuMiu");
       rabbit.setName("兔兔");

       dog.eat();      
       cat.eat();
       rabbit.eat();
     
       
    }  
  }


