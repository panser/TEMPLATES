package itvdn.c_behavioral.h_State;

import itvdn.c_behavioral.h_State.pattern.ConcreteStateA;
import itvdn.c_behavioral.h_State.pattern.Context;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
    }
}
