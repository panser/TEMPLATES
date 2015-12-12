package itvdn.c_behavioral.g_Observer.pattern;

import java.util.ArrayList;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Subject {

    private String state;
    ArrayList<Observer> observers = new ArrayList();

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }


    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(state);
        }
    }

}
