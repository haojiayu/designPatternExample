package me.eae.designPattern.composite;

/**
 * Created by 郝家雨 on 2018/3/27.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("无添加功能");
    }

    @Override
    public void remove(Component c) {
        System.out.println("无删除功能");
    }

    @Override
    public void display(int depth) {
    System.out.println(depth+name);
    }
}
