package itvdn.b_structural.c_Composite;

import itvdn.b_structural.c_Composite.pattern.Component;
import itvdn.b_structural.c_Composite.pattern.Composite;
import itvdn.b_structural.c_Composite.pattern.Leaf;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Component root = new Composite("ROOT");
        Component branch1 = new Composite("BR1");
        Component branch2 = new Composite("BR2");
        Component leaf1 = new Leaf("L1");
        Component leaf2 = new Leaf("L2");

        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf1);
        branch2.add(leaf2);

        root.operation();

        branch2.getChild(0).operation();
    }
}
