package itvdn.c_behavioral.j_Strategy;

import itvdn.c_behavioral.j_Strategy.pattern.Context;
import itvdn.c_behavioral.j_Strategy.pattern.impl.ConcreteStrategyA;
import itvdn.c_behavioral.j_Strategy.pattern.impl.ConcreteStrategyB;
import itvdn.c_behavioral.j_Strategy.pattern.impl.ConcreteStrategyC;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
