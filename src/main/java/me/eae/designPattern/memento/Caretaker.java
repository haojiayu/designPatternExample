package me.eae.designPattern.memento;

/**
 * Created by 郝家雨 on 2018/3/24.
 * 负责保存好备忘录Memento，不能对备忘录的内容进行操作或检查
 */
public class Caretaker {
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }
    public  void  setMemento(Memento memento){
        this.memento = memento;
    }
}
