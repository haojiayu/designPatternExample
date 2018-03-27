package me.eae.designPattern.observer;

/**
 * Created by 郝家雨 on 2018/3/17.
 */
public class Test {
    public static void main(String []args){
        //创建主题或者观察者
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者1,将主题传入观察者
        ConcreteObserver observer1 = new ConcreteObserver(subject,"观察者1") ;
        //创建观察者2,将主题传入观察者
        ConcreteObserver observer2 = new ConcreteObserver(subject,"观察者2");
        //观察者导入主题
        subject.attach(observer1);
        subject.attach(observer2);
        //主题修改状态
        subject.setSubjectState("修改啦");
        //主题发布
        subject.inform();
        //查看观察者状态
        observer1.toString();
        observer2.toString();
    }
}
