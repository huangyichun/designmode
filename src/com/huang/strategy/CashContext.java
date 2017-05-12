package com.huang.strategy;

/**
 * 策略模式初始版本
 * Created by huang on 17-4-12.
 */
public class CashContext {

    private CashStrategy cashStrategy;

    public CashContext(CashStrategy cashStrategy) {
        this.cashStrategy = cashStrategy;
    }

    public double getResult(double money){
        return cashStrategy.acceptCash(money);
    }
}
