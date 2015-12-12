package itvdn.c_behavioral.g_Observer.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteObserver extends Observer{

    String observerState;
    ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String state) {
        observerState = state;
    }
}
