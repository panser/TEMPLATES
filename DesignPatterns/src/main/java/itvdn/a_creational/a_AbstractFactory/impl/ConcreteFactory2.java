package itvdn.a_creational.a_AbstractFactory.impl;

import itvdn.a_creational.a_AbstractFactory.AbstractFactory;
import itvdn.a_creational.a_AbstractFactory.AbstractProductA;
import itvdn.a_creational.a_AbstractFactory.AbstractProductB;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
