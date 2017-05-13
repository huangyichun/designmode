package observer;

/**
 * 具体观察者
 */
public class ObserverA implements Observer {

    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }


    @Override
    public void update(Subject subject) {
        setMyState(((ConcreteSubject)subject).getState());
    }
}
