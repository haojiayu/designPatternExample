package me.eae.designPattern.observer;

/**
 * Created by 郝家雨 on 2018/3/17.
 * ConcreteObserver类，具体观察者，实现抽象观察者所要求的更新接口。以便使本身的状态与主题的状态想协调。
 * 具体观察者角色可以保存一个指向具体主题对象的引用。具体观察者角色通常用一个具体子类实现。
 */
public  class ConcreteObserver implements Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;
    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }

    public void update() {
        observerState = subject.getSubjectState();
        //System.out.println("对象状态更新为:"+observerState);
    }
    public String toString(){
        System.out.println(name+"当前状态为"+observerState);
        return null;
    }
}
