package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void SetStockCount(int newCountAdded) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount = stockCount + newCountAdded;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
