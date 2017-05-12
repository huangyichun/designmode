package simpleFactory;

/**
 * Created by huang on 17-4-11.
 */
public class Main {

    public static void main(String[] args) {

        Operation operation = OperationFactory.createOperate("*");
        operation.setNumberA(10);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
