package BanAccount;

public class BankAccount {

    int id;
    double balance;
    private static double interestRate = 0.02;
    private static int accountsCount = 0;


    public BankAccount(){
        accountsCount++;
        this.id = accountsCount;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit (double money){
        this.balance += money;
    }

    public double getInterest (int year){
        return year * interestRate * this.balance;
    }
}
