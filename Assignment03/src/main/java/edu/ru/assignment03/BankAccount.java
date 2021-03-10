
package edu.ru.assignment03;

public class BankAccount {
    
    
    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
       
}
    public double deposit(double amount){
        this.balance = balance + amount;
        
        return this.balance;
    }
    
    public double withdraw(double amount){
        this.balance = balance - amount;
        
        return this.balance;
    }
    
    public void display(){
        System.out.println("Available Balance: $" + this.balance);
    }
}
