package itvdn.a_creational.d_Prototype.run;

import itvdn.a_creational.d_Prototype.Prototype;
import itvdn.a_creational.d_Prototype.impl.ConcretePrototype1;
import itvdn.a_creational.d_Prototype.impl.ConcretePrototype2;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Prototype prototype = null;
        Prototype original = null;

        prototype = new ConcretePrototype1(1);
        original = prototype.clone();

        prototype = new ConcretePrototype2(2);
        original = prototype.clone();
    }
}
