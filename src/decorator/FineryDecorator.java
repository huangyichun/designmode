package decorator;

/**
 * 抽象装饰类
 */
public class FineryDecorator implements Componet {

    private Componet componet;

    public FineryDecorator(Componet componet) {//装饰对象
        this.componet = componet;
    }

    @Override
    public void operation() {
        componet.operation();
    }
}
