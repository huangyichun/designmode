package decorator;

/**
 * 测试装饰模式
 */
public class Main {

    public static void main(String[] args) {
        PersonComponent person = new PersonComponent("小菜");
        FineryDecorator decorator = new LeatherDecorator(
                new TShirtsDecorator(
                        new BigTrouserDecorator(person)));
        decorator.operation();
    }
}
