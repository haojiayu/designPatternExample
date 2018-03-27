package me.eae.designPattern.simpleFactory;

/**
 * Created by 郝家雨 on 2018/3/14.
 */
public class OperationFactory {

    public Operation getOperation(char type){
        switch (type){
            case '+':
                return new AddOperation();
            case '-':
                return new SubOperation();
            default:
                return null;
        }
    }

}
