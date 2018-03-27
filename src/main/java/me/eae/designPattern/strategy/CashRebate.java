package com.eae.strategy;

/**
 * Created by 郝家雨 on 2018/3/15.
 */
public class CashRebate extends CashSuper{
    public double getResult(double money){
        return money*0.8;
    }
}
