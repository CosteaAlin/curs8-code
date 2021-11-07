package ro.fasttractit.curs8.interfaces;

import ro.fasttractit.curs8.interfaces.senders.FacebookSender;
import ro.fasttractit.curs8.interfaces.senders.SMSSender;

public class MainSender {
    public static void main(String[] args) {
        MessageSender facebookSender=new FacebookSender();
        MessageSender smsSender=new SMSSender();
        Expeditor expeditor= new Expeditor(smsSender);
        expeditor.sendMessage("salutare tuturor");
    }
}
