package me.eae.designPattern.factoryMethod;

/**
 * Created by 郝家雨 on 2018/3/16.
 */
public class Test {
    public static void main(String []args){
        Factory factory = new ConcretFactory();
        factory.getProduct();
    }
}
