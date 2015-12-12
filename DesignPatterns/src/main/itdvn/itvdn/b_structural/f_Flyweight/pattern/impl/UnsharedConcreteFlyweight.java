package itvdn.b_structural.f_Flyweight.pattern.impl;

import itvdn.b_structural.f_Flyweight.pattern.ConsoleColor;
import itvdn.b_structural.f_Flyweight.pattern.Flyweight;

/**
 * Created by Sergey on 11/29/2015.
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    String allState = "UnsharedConcreteFlyweight ";

    @Override
    public void operation(ConsoleColor extrinsicState)
    {
//        Console.ForegroundColor = extrinsicState;
        System.out.println(allState + this.hashCode());
    }
}
