package itvdn.b_structural.b_Bridge;

import itvdn.b_structural.b_Bridge.pattern.abstraction.Abstraction;
import itvdn.b_structural.b_Bridge.pattern.abstraction.RefinedAbstraction;
import itvdn.b_structural.b_Bridge.pattern.implementor.ConcreteImplementorA;
import itvdn.b_structural.b_Bridge.pattern.implementor.ConcreteImplementorB;
import itvdn.b_structural.b_Bridge.pattern.implementor.Implementor;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Implementor implementor;
        Abstraction abstraction;

        implementor = new ConcreteImplementorA();
        abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
