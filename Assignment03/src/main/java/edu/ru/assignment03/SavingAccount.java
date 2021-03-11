package edu.ru.assignment03;

public class SavingAccount extends BankAccount {

    private double annualInterestRate;

    public SavingAccount(String owner, double balance, double annualInterestRate) {
        super(owner, balance);
        this.annualInterestRate = annualInterestRate;

    }

    public void depositMonthlyInterest() {
        
        double monthlyInterestRate = this.annualInterestRate / 10;
        this.setBalance(this.getBalance() + monthlyInterestRate);
        

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public double withdraw(double amount) {
        System.out.println("------------------");
        System.out.println(this.getOwner()+ "'s Initial Balance: $" + this.getBalance());
        System.out.println("Withdraw: $" + amount);
        this.setBalance(this.getBalance() - amount);
        if (this.getBalance() - amount < 0) {
            System.out.println("Error: Insufficient funds.");
            this.setBalance(this.getBalance() + amount);
        }
        System.out.println("Available Balance: $" + this.getBalance());
        System.out.println("------------------");
        

        return this.getBalance();

    }

    @Override
    public void display() {
        System.out.println("------------------");
        System.out.println(this.getOwner() + "'s Savings Account");
        System.out.println("Available Balance: $" + this.getBalance());
//        System.out.println("Annual Interest: " + this.getAnnualInterestRate() + "%");
        System.out.println("------------------");
    }

}
