package me.eae.designPattern.strategy;

/**
 * Created by 郝家雨 on 2018/3/15.
 */
public class CashContext {
    private CashSuper cash = null;
    public CashContext(char type){

        switch (type){
            case 'a':
                cash = new CashNormal();
                return;
            case 'b':
                cash = new CashRebate();
                return;
            case 'c':
                cash = new CashReturn();
                return;
            default:
                cash = null;
        }
    }
    public double getResult(double money){
        if(cash!=null){
            return cash.getResult(money);
        }
        return 0;
    }
}
