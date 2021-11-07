package ro.fasttractit.curs8.interfaces.senders;

import ro.fasttractit.curs8.interfaces.MessageSender;

public class EmailSender implements MessageSender {
    public void send(String msg) {
        System.out.println("Sending over email " + msg);
    }

    public int getCost() {
        return 1;
    }
}
