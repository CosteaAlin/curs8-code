package ro.fasttractit.curs8.homework.advertise;

public class Facebook implements AdvertiseProvider{

    public String sendAdvertise() {
        return "Advertise sent on Facebook";
    }

    public int getCost() {
        return 15;
    }
}
