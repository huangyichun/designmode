package com.huang.simpleFactory;

/**
 * Created by huang on 17-4-11.
 */
public class OperationSub extends Operation{

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
