package simpleFactory;

/**
 * Created by huang on 17-4-11.
 */
public class OperationFactory {

    /**
     * 采用多态，根据传入的参数，返回父类引用子类对象
     * @param operate
     * @return
     */
    public static Operation createOperate(String operate) {
        Operation operation;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationDiv();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("输入的符号不正确");
        }
        return operation;
    }
}
