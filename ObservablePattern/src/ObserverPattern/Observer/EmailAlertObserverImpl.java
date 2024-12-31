package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId , StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId,"product is in stock hurry up!!");

    }
    public void sendEmail(String emailId, String msg){
        System.out.println("mail sent to "+emailId);
        //send the actual email to user
    }
}
