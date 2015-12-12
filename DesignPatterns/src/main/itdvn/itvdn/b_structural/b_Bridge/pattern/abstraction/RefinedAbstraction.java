package itvdn.b_structural.b_Bridge.pattern.abstraction;

import itvdn.b_structural.b_Bridge.pattern.implementor.Implementor;

/**
 * Created by Sergey on 11/29/2015.
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        // ...
        super.operation();
        // ...
    }
}
