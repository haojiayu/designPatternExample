package me.eae.designPattern.strategy;

/**
 * Created by 郝家雨 on 2018/3/15.
 */

/**
 * 正常收费
 */
public class CashNormal extends CashSuper {

    public double getResult(double money){
        return money;
    }

}
