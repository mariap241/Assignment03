
package edu.ru.assignment03;

public class MainClass {
    
    public static void main(String[] args){
       
       //created savings account for Joe 
       SavingAccount customer01= new SavingAccount ("Joe", 100, 1);
       customer01.display();
       
       //created checking account for Emily
       CheckingAccount customer02 = new CheckingAccount ("Emily", 200, 20);
       customer02.display();
       
       //deposit $50 to Emily's checking account
       customer02.deposit(50);
       
       
       //withdraw $25 from Joe's Account
       customer01.withdraw(25);
      
       
       //process $50 check to Emily's account
       customer02.processCheck(50);
       
       
       //transfer $100 from Emily's account to Joe's account
       customer02.withdraw(100);
       customer01.deposit(100);
       
       
       //created savings account for Sam
       SavingAccount customer03 = new SavingAccount("Sam", 250, 0.5);
       customer03.display();
       
       //deposit monthly interest to savings accounts
       customer01.depositMonthlyInterest();
       customer01.display();
       customer03.depositMonthlyInterest();
       customer03.display();
       
       //withdraw $500 from Emily's Account
       customer02.withdraw(500);
       
       
       //withdraw $500 from Joe's Account
       customer01.withdraw(500);
       
    }
}
