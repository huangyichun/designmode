package com.huang.simpleFactory;

/**
 * Created by huang on 17-4-11.
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if(getNumberB() == 0){
            throw new RuntimeException("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}
