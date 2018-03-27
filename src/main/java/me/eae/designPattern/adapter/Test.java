package me.eae.designPattern.adapter;

/**
 * Created by 郝家雨 on 2018/3/19.
 */
public class Test {
    public static void main(String []args){
        Target target = new Adapter();
        target.request();
    }
}
