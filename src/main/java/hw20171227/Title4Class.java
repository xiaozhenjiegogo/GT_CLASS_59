/**
 * Project Name:dt59homework
 * File Name:Title4Class.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:29:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:29:46 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class Title4Class {
    String lady;
    String hair;
    String eyes;
    boolean longleg;
    int age;
    
    public Title4Class(String lady,String hair){
        this.lady=lady;
        this.hair=hair;       
    }
    public Title4Class(String lady,String hair,String eye){
        this(lady, hair);
        this.eyes=eye;    //如果变量名不一致，则不需要用this,可能直接调用属性;
    }
    public Title4Class(String lady,String hair,String eyes,int age){
        this(lady,hair,eyes);  //括号里面变量与括号里的参数一致；
        this.age=age;
    }
    }



