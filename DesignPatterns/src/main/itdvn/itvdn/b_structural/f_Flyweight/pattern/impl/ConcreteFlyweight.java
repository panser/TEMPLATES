package itvdn.b_structural.f_Flyweight.pattern.impl;

import itvdn.b_structural.f_Flyweight.pattern.ConsoleColor;
import itvdn.b_structural.f_Flyweight.pattern.Flyweight;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteFlyweight extends Flyweight {

    String intrinsicState = "ConcreteFlyweight ";
    ConsoleColor extrinsicState;

    @Override
    public void operation(ConsoleColor extrinsicState) {

        this.extrinsicState = extrinsicState;
//        Console.ForegroundColor = this.extrinsicState;
        System.out.println(intrinsicState + this.hashCode());
    }
}
