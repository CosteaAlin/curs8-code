package ro.fasttractit.curs8.interfaces.senders;

import ro.fasttractit.curs8.interfaces.MessageSender;

public class SMSSender implements MessageSender {
    public void send(String msg) {
        System.out.println("Sending over SMS " + msg);
    }

    public int getCost() {
        return 3;
    }
}
