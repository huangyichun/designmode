package strategy;

/**
 * 策略模式与简单工厂模式结合
 */
public class CashContext_2 {
    CashStrategy cashStrategy;

    public CashContext_2(String type) {
        switch (type){
            case "正常收费":
                cashStrategy = new CashNomalStrategy();
                break;
            case "满300返100":
                cashStrategy = new CashReturnStrategy(300, 100);
                break;
            case "打8折":
                cashStrategy = new CashRebateStrategy(0.8);
                break;
        }
    }
    public double getResult(double money){
        return cashStrategy.acceptCash(money);
    }
}
