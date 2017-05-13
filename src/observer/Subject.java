package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 */
public class Subject {

    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    public void notifyAllObserver(){
        list.forEach(observer -> observer.update(this));
    }
}
