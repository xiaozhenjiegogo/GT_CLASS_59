/**
 * Project Name:dt59homework
 * File Name:Pet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:12:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:12:25 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Pet {
/*场景一：
 *  父类：酒类（wine）
 *  子类：啤酒(beer)，白酒(JNC)；
 *  多态的方法（degree）：啤酒度数低，白酒度数高；
 * 场景二：
 *  父类：学校（school）
 *  子类：班级1，班级2
 *  多态的方法(teach)：班级1教JAVA,班级2教UI
 * 场景三：
 *  父类：饮料
 *  子类：碳酸饮料，矿泉水
 *  多态的方法（drink）：碳酸有汽对身体无益，矿泉水无汽对身体无害
 */
    private String name;

    private String game;
    
  
    public void eat(){
        
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
//返回值实现多态不太懂，就没做。
