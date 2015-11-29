package itvdn.c_behavioral.f_Memento.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Caretaker {

    public Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
