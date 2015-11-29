package itvdn.a_creational.c_FactoryMethod.run;

import itvdn.a_creational.c_FactoryMethod.Creator;
import itvdn.a_creational.c_FactoryMethod.Product;
import itvdn.a_creational.c_FactoryMethod.impl.ConcreteCreator;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Creator creator = null;
        Product product = null;

        creator = new ConcreteCreator();
        product = creator.factoryMethod();

        creator.anOperation();
    }
}
