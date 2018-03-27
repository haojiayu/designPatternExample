package com.eae.memento;

/**
 * Created by 郝家雨 on 2018/3/24.
 */
public class Test {
    public static void main(String []args){
        Originator originator = new Originator();
        originator.Status = "on";//originator 初始化状态，状态属性为on

        Caretaker c = new Caretaker();//创建备份管理者
        c.setMemento(originator.CreateMemento());//创建备份

        originator.Status = "off";//将originator状态改为off
        originator.setMemento(c.getMemento());//恢复备份



    }
}
