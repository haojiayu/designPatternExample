package me.eae.designPattern.adapter;

/**
 * Created by 郝家雨 on 2018/3/19.
 * 通过在内部包装一个Adaptee对象，在源接口转换成目标接口
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();
    public void request(){
        adaptee.specifRequest();
    }

}
