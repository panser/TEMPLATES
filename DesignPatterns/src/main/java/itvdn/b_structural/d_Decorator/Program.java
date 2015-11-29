package itvdn.b_structural.d_Decorator;

import itvdn.b_structural.d_Decorator.pattern.Component;
import itvdn.b_structural.d_Decorator.pattern.Decorator;
import itvdn.b_structural.d_Decorator.pattern.impl.ConcreteComponent;
import itvdn.b_structural.d_Decorator.pattern.impl.ConcreteDecoratorA;
import itvdn.b_structural.d_Decorator.pattern.impl.ConcreteDecoratorB;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA();
        Decorator decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);

        decoratorB.operation();
    }
}
