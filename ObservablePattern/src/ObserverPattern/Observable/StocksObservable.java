package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void notifySubscribers();

    public void SetStockCount(int count);

    public int getStockCount();

}
