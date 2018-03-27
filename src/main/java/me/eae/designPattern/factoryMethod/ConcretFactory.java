package com.eae.factoryMethod;

/**
 * Created by 郝家雨 on 2018/3/16.
 * 重定义工厂方法以返回一个ConcreteProduct实例
 */
public class ConcretFactory implements Factory {
    public Product getProduct() {
        return new ConcreteProduct();
    }
}
