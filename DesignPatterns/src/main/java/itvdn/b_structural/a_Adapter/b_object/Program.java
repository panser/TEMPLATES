package itvdn.b_structural.a_Adapter.b_object;

import itvdn.b_structural.a_Adapter.b_object.pattern.Adapter;
import itvdn.b_structural.a_Adapter.b_object.pattern.Target;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Target target = new Adapter();
        target.request();
    }
}
