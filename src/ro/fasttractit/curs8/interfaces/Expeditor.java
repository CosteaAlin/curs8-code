package ro.fasttractit.curs8.interfaces;

public class Expeditor {
    private MessageSender messageSender;

    public Expeditor(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String msg) {
        messageSender.send("My message is " +msg);
        System.out.println("M-a costat " + messageSender.getCost());
    }
}
