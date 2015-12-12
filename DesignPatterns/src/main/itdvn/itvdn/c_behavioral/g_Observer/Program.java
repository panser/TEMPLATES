package itvdn.c_behavioral.g_Observer;

import itvdn.c_behavioral.g_Observer.pattern.ConcreteObserver;
import itvdn.c_behavioral.g_Observer.pattern.ConcreteSubject;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject));
        subject.attach(new ConcreteObserver(subject));
        subject.setState("Some State ...");
        subject.notifyObserver();
    }
}
