package edu.ru.assignment03;

public class CheckingAccount extends BankAccount {

    private double insufficienFundsFee;

    public CheckingAccount(String owner, double balance, double insufficientFundsFee) {
        super(owner, balance);
        this.insufficienFundsFee = insufficientFundsFee;
    }

    public void processCheck(double checkAmount) {
        System.out.println("------------------");
        System.out.println(this.getOwner()+ "'s Initial Balance: $" + this.getBalance());
        System.out.println("Check Amount: $" + checkAmount);
        this.setBalance(this.getBalance() + checkAmount);
        System.out.println("Available Balance: $" + this.getBalance());
        System.out.println("------------------");

    }

    public double getInsufficienFundsFee() {
        return insufficienFundsFee;
    }

    public void setInsufficienFundsFee(double insufficienFundsFee) {
        this.insufficienFundsFee = insufficienFundsFee;
    }

    @Override
    public double withdraw(double amount) {
        System.out.println("------------------");
        System.out.println(this.getOwner() + "'s Initial Balance: $" + this.getBalance());
        this.setBalance(this.getBalance() - amount);
        if (this.getBalance() - amount < 0) {
            this.setBalance(this.getBalance() - this.getInsufficienFundsFee());
            System.out.println("Warning: Insufficient funds detected, fee added");
        }
        System.out.println("Withdraw: $"+ amount);
        System.out.println("Available Balance: $" + this.getBalance());
        System.out.println("------------------");
        return this.getBalance();

    }

    @Override
    public void display() {
        System.out.println("------------------");
        System.out.println(this.getOwner()+ "'s Checking Account");
        System.out.println("Available Balance: $" + this.getBalance());
//        System.out.println("Insufficient Funds Fee: $" + this.getInsufficienFundsFee());

        System.out.println("------------------");
    }
}
