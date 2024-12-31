package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.observable=observable;
        this.userName=userName;

    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"product is in stock hurry up");
    }

    public void sendMsgOnMobile(String userName, String msg){

        System.out.println("msg sent to"+userName);


    }
}
