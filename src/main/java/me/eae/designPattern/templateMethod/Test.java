package me.eae.designPattern.templateMethod;

/**
 * Created by 郝家雨 on 2018/3/16.
 */
public class Test {
    public static void main(String []args){
        AbstractClass abstractClass1 = new ConcreteClass1();
        abstractClass1.templateMethod();
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass2.templateMethod();
    }

}
