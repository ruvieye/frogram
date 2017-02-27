package frog.gram.pattern.observer.subject;

import frog.gram.pattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heesu on 2017-02-28.
 */
public abstract class Subject {
    private List<Observer> observers  = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update();
        }
    }
}
