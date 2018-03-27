package com.eae.strategy;

/**
 * Created by 郝家雨 on 2018/3/15.
 */

/**
 * 满减
 * 满300减50
 */
public class CashReturn extends CashSuper {
    public double getResult(double money){

        return money>300?(money-50):money;
    }
}
