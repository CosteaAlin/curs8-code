package ro.fasttractit.curs8;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Car.LATIME=120;
        System.out.println(Car.LATIME);
        Car dacia=new Car("Dacia");
        System.out.println(dacia.LATIME);
        Car opel=new Car("Opel");
        dacia.LATIME++;
        System.out.println(opel.LATIME);

        Car nullcar=null;
        System.out.println(nullcar.LATIME);

        System.out.println(Car.buildMessage());

        Objects.equals(dacia, opel);
    }
}
