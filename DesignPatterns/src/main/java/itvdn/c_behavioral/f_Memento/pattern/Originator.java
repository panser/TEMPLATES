package itvdn.c_behavioral.f_Memento.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Originator {

    public String state;

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public Memento createMemento(){
        return new Memento(state);
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
