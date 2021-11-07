package ro.fasttractit.curs8.interfaces.food;

public class McDonalds implements FoodProvider {
    private int quantity;

    public McDonalds(int quantity) {
        this.quantity = quantity;
    }

    public String deliverFood() {
        return "Delivering " + prepareFood();
    }

    private String prepareFood() {
        return "burgers";
    }

    public int deliverQuantity() {
        return this.quantity;
    }
}
