package ro.fasttractit.curs8.homework.advertise;

public class Company {
    private AdvertiseProvider advertiseProvider;

    public Company(AdvertiseProvider advertiseProvider) {
        this.advertiseProvider = advertiseProvider;
    }

    public void sendAdvertiseToCustomers() {
        System.out.println(advertiseProvider.sendAdvertise() + ", cost: " + advertiseProvider.getCost());
    }
}
