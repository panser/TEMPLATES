package itvdn.b_structural.d_Decorator.pattern.impl;

import itvdn.b_structural.d_Decorator.pattern.Decorator;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteDecoratorA extends Decorator {

    String addedState = "Some State";

    @Override
    public void operation() {
        super.operation();
        System.out.println(addedState);
    }
}
