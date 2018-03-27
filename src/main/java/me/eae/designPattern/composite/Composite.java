package me.eae.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 郝家雨 on 2018/3/27.
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
            children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(name);
    for(Component c:children){

        c.display(depth);
    }
    }
}
