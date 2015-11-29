package itvdn.c_behavioral.a_Chain_of_Responsibility.pattern.impl;

import itvdn.c_behavioral.a_Chain_of_Responsibility.pattern.Handler;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteHandler2 extends Handler{

    @Override
    public void handleRequest(int request) {

        if (request == 2)
            System.out.println("Two");
        else if (successor != null)
            successor.handleRequest(request);
    }
}
