package ro.fasttractit.curs8.homework.banking;

public class BRD implements BankObligations{
    private double currentAmount;

    public BRD(double currentAmount) {
        this.currentAmount = currentAmount; //set the initial amount
    }

    public void depositMoney(double value) {
        if (checkValue(value)) {
            currentAmount += value;
            System.out.println("Your current amount at BRD is " + currentAmount);
        } else {
            System.out.println("You are not allowed to enter a negative number");
        }
    }

    public void withdrawMoney(double value) {
        if (checkValue(value)) {
            if (value < currentAmount) {
                currentAmount -= value;
                System.out.println("Your current amount at BRD is " + currentAmount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("You are not allowed to enter a negative number");
        }
    }

    private boolean checkValue(double value) {
        return value > 0;
    }
}
