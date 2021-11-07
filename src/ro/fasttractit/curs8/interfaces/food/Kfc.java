package ro.fasttractit.curs8.interfaces.food;

public class Kfc implements FoodProvider{
    private McDonalds mcDonalds;

    public Kfc(int quantity){
        mcDonalds = new McDonalds(quantity);
    }

    public String deliverFood(){
        return "KFC " + mcDonalds.deliverFood();
    }

    public int deliverQuantity(){
        return mcDonalds.deliverQuantity()-1;
    }
}
