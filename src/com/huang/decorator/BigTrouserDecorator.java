package com.huang.decorator;

/**
 *具体装饰类
 */
public class BigTrouserDecorator extends FineryDecorator {

    public BigTrouserDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("穿上垮库");
    }
}
