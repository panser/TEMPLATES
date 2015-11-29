package itvdn.b_structural.d_Decorator.pattern.impl;

import itvdn.b_structural.d_Decorator.pattern.Decorator;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteDecoratorB extends Decorator {

    void addedBehavior(){
        System.out.println("AddedBehavior");
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
