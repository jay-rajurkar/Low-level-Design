import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        StocksObservable iphoneStockobservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("puijj", iphoneStockobservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockobservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("abcrao", iphoneStockobservable);

        iphoneStockobservable.add(observer1);
        iphoneStockobservable.add(observer2);
        iphoneStockobservable.add(observer3);

        iphoneStockobservable.SetStockCount(10);
        iphoneStockobservable.SetStockCount(0);
        iphoneStockobservable.SetStockCount(100);


    }
}