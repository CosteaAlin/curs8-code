package ro.fasttractit.curs8.homework.animal;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalBehaviour cat = new Cat();
        System.out.println(cat.eat());
        System.out.println(cat.talk());
        System.out.println(cat.walk());

        AnimalBehaviour dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.talk());
        System.out.println(dog.walk());
    }
}
