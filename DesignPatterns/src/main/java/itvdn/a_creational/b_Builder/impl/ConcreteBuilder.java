package itvdn.a_creational.b_Builder.impl;

import itvdn.a_creational.b_Builder.Builder;
import itvdn.a_creational.b_Builder.Product;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteBuilder extends Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public void buildPartC() {
        product.add("Part C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
