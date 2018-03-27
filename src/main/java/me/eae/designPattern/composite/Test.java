package me.eae.designPattern.composite;

/**
 * Created by 郝家雨 on 2018/3/27.
 */
public class Test {

    public static void main(String []args){
        Component root = new Composite("root");

        Component c1 = new Composite("1");
        Component c2 = new Composite("2");
        Component c3 = new Composite("3");
        Component c4 = new Composite("4");

        Component c11 = new Composite("1.1");
        Component c12 = new Composite("1.2");
        Component c13 = new Composite("1.3");
        Component c14 = new Composite("1.4");
        c1.add(c11);
        c1.add(c12);
        c1.add(c13);
        c1.add(c14);
        Component c21 = new Composite("2.1");
        Component c22 = new Composite("2.2");
        Component c23 = new Composite("2.3");
        Component c24 = new Composite("2.4");
        c2.add(c21);
        c2.add(c22);
        c2.add(c23);
        c2.add(c24);
        root.add(c1);
        root.add(c2);
        root.add(c3);
        root.add(c4);
        root.display(1);
    }

}
