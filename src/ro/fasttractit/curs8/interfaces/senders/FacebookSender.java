package ro.fasttractit.curs8.interfaces.senders;

import ro.fasttractit.curs8.interfaces.MessageSender;

public class FacebookSender implements MessageSender {
    public void send(String msg) {
        System.out.println("Sending over Facebook " + msg);
    }

    public int getCost() {
        return 10;
    }
}
