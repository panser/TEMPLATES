package itvdn.a_creational.c_FactoryMethod.impl;

import itvdn.a_creational.c_FactoryMethod.Product;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteProduct extends Product {

    public ConcreteProduct() {
        System.out.println(this.hashCode());
    }
}
