package itvdn.a_creational.a_AbstractFactory.impl;

import itvdn.a_creational.a_AbstractFactory.AbstractProductA;
import itvdn.a_creational.a_AbstractFactory.AbstractProductB;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ProductB1 extends AbstractProductB {

    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this + " interacts with " + a);
    }
}
