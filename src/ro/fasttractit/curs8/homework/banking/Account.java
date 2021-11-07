package ro.fasttractit.curs8.homework.banking;

public class Account {
    BankObligations bankObligations;

    public Account(BankObligations bankObligations) {
        this.bankObligations = bankObligations;
    }

    public void depositMoney(double value) {
        bankObligations.depositMoney(value);
    }

    public void withdrawMoney(double value) {
        bankObligations.withdrawMoney(value);
    }
}
