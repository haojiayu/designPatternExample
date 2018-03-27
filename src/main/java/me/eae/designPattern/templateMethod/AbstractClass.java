package com.eae.templateMethod;

/**
 * Created by 郝家雨 on 2018/3/16.
 * 实现了一个模板方法，定义了算法的骨架，具体子类将重新定义PrimitiveOperation以实现一个算法步骤
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation1();
    }
}
