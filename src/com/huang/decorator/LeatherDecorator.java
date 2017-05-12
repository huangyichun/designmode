package com.huang.decorator;

/**
 * 具体装饰类
 */
public class LeatherDecorator extends FineryDecorator {
    public LeatherDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("穿皮鞋");
    }
}
