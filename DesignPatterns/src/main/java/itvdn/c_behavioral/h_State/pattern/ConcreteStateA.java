package itvdn.c_behavioral.h_State.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateB();
    }
}
