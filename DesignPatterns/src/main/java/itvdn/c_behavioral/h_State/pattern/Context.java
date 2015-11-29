package itvdn.c_behavioral.h_State.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Context {

    public State state;

    public Context(State state){
        this.state = state;
    }

    public void request(){
        this.state.handle(this);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
