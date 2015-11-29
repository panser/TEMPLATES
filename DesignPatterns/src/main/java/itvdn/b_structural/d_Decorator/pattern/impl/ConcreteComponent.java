package itvdn.b_structural.d_Decorator.pattern.impl;


import itvdn.b_structural.d_Decorator.pattern.Component;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent.operation()");
    }
}
