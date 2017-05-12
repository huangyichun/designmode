package com.huang.strategy;


public class Main {
    public static void main(String[] args) {
        CashStrategy cashStrategy = new CashReturnStrategy(500,200);
        CashContext cashContext = new CashContext(cashStrategy);
        double money = cashContext.getResult(750.6);
        System.out.println(money);

        System.out.println("----------------------");
        //策略模式与简单工厂模式结合
        CashContext_2 cashContext_2 = new CashContext_2("打8折");
        money = cashContext_2.getResult(300);
        System.out.println(money );
    }
}
