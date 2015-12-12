package itvdn.b_structural.a_Adapter.a_class.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Adapter extends Adaptee implements ITarget {

    @Override
    public void request() {
        super.specificRequest();
    }
}
