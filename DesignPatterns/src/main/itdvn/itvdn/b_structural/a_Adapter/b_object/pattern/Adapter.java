package itvdn.b_structural.a_Adapter.b_object.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Adapter extends Target {

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
