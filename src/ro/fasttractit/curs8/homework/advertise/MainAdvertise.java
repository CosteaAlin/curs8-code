package ro.fasttractit.curs8.homework.advertise;

public class MainAdvertise {
    public static void main(String[] args) {
        new Company(new Email()).sendAdvertiseToCustomers();
        new Company(new Facebook()).sendAdvertiseToCustomers();
    }
}
