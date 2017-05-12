package com.huang.decorator;

/**
 *具体装饰类
 */
public class TShirtsDecorator extends FineryDecorator{

    public TShirtsDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("穿上T恤");
    }
}
