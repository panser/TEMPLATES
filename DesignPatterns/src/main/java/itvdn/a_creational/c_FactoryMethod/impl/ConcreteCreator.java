package itvdn.a_creational.c_FactoryMethod.impl;

import itvdn.a_creational.c_FactoryMethod.Creator;
import itvdn.a_creational.c_FactoryMethod.Product;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
