package ro.fasttractit.curs8.homework.advertise;

public class Email implements AdvertiseProvider {

    public String sendAdvertise() {
        return "Advertise sent on Email";
    }

    public int getCost() {
        return 10;
    }
}
