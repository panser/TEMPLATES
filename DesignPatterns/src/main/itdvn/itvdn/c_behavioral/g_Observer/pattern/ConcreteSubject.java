package itvdn.c_behavioral.g_Observer.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
