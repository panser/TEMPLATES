package itvdn.c_behavioral.f_Memento;

import itvdn.c_behavioral.f_Memento.pattern.Caretaker;
import itvdn.c_behavioral.f_Memento.pattern.Originator;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("On");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");

        originator.setMemento(caretaker.getMemento());
    }
}
