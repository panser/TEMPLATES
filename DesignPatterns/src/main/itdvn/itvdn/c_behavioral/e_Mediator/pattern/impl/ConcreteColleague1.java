package itvdn.c_behavioral.e_Mediator.pattern.impl;

import itvdn.c_behavioral.e_Mediator.pattern.Colleague;
import itvdn.c_behavioral.e_Mediator.pattern.Mediator;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void notify(String message){
        System.out.println(this + " got " + message);
    }
}
