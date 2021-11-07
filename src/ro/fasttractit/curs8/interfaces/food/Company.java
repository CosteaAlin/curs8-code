package ro.fasttractit.curs8.interfaces.food;

public class Company {

    private FoodProvider foodProvider;

    public Company(FoodProvider foodProvider){
        this.foodProvider=foodProvider;
    }

    public void sendFoodToEmployee() {
        System.out.println("Sending food " + foodProvider.deliverFood() + " quantity " + foodProvider.deliverQuantity());
    }
}
