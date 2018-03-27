package me.eae.designPattern.composite;

/**
 * Created by 郝家雨 on 2018/3/27.
 */
public abstract class Component {
    protected String name;
    public Component(String name){
        this.name = name;
    }
    //使用add和remove方法来提供删除或增加树叶或树枝的功能
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
