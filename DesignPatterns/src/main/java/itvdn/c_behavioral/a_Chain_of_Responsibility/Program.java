package itvdn.c_behavioral.a_Chain_of_Responsibility;

import itvdn.c_behavioral.a_Chain_of_Responsibility.pattern.Handler;
import itvdn.c_behavioral.a_Chain_of_Responsibility.pattern.impl.ConcreteHandler1;
import itvdn.c_behavioral.a_Chain_of_Responsibility.pattern.impl.ConcreteHandler2;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);
        h1.handleRequest(1);
        h1.handleRequest(2);
    }
}
