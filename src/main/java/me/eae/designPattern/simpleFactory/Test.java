package me.eae.designPattern.simpleFactory;

/**
 * Created by 郝家雨 on 2018/3/14.
 */
public class Test {
    public static void main(String []args){
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getOperation('+');
        operation.setNum1(1);
        operation.setNum2(2);
        System.out.println(operation.getResult());
    }
}
