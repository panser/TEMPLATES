package itvdn.c_behavioral.j_Strategy.pattern.impl;

import itvdn.c_behavioral.j_Strategy.pattern.Strategy;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteStrategyA extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyA");
    }
}
