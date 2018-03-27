package me.eae.designPattern.strategy;

/**
 * Created by 郝家雨 on 2018/3/15.
 */
public class Test {
    public static void main(String []args){
        CashContext cash = new CashContext('c');
        System.out.println(cash.getResult(500));
    }
}
