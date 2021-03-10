
package edu.ru.assignment03;

public class MainClass {
    
    public static void main(String[] args){
    BankAccount customer01 = new BankAccount("maria", 189);
    customer01.withdraw(80);
    customer01.display();
    
    customer01.deposit(800);
    customer01.display();
    }
}
