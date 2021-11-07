package ro.fasttractit.curs8.homework.banking;

public class BankingMain {
    public static void main(String[] args) {
        Account ing = new Account(new ING(255));
        ing.depositMoney(100);
        ing.withdrawMoney(400);

        Account bt=new Account(new BT(300));
        bt.withdrawMoney(215);
        bt.depositMoney(55);

        Account brd=new Account(new BRD(975));
        brd.depositMoney(5);
        brd.withdrawMoney(142);
    }
}
