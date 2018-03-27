package me.eae.designPattern.templateMethod;

/**
 * Created by 郝家雨 on 2018/3/16.
 * 实现primitiveOperation以完成算法中与特定子类相关的操作
 */
public class ConcreteClass1 extends AbstractClass {
    public void primitiveOperation1() {
        System.out.println("ConcreteClass1 实现的primitiveOperation1()");
    }

    public void primitiveOperation2() {
        System.out.println("ConcreteClass1 实现的primitiveOperation2()");
    }
}
