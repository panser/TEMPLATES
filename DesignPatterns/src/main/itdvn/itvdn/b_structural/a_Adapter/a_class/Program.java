package itvdn.b_structural.a_Adapter.a_class;

import itvdn.b_structural.a_Adapter.a_class.pattern.Adapter;
import itvdn.b_structural.a_Adapter.a_class.pattern.ITarget;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        ITarget target = new Adapter();
        target.request();
    }
}
