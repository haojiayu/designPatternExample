package me.eae.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 郝家雨 on 2018/3/17.
 * subject 可翻译成主题或者抽象通知者，一般用一个抽象类或者一个接口实现。它把所有对观察者对象的引用保存到一个集合中，每个主题都可以有任何数量的观察者，
 * 抽象主题提供一个接口，乐意增加和删除观察者对象。
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    //增加观察者
    public void attach(Observer oberver){
        observers.add(oberver);
    }
    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void inform(){
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
