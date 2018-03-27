package com.eae.memento;

/**
 * Created by 郝家雨 on 2018/3/24.
 * 负责常见一个备忘录Memento,用于记录当前时刻它的内部状态，并可使用备忘录恢复到某种状态。
 */
public class Originator {

    private String status;//需要保存的属性，可能有多个
    public  String Status;
    public Memento CreateMemento(){//创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
        return (new Memento(status));
    }
    public void setMemento(Memento memento){
        status = memento.getStatus();
    }

}
