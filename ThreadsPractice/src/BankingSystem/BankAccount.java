package BankingSystem;

public class BankAccount {
    private double balance;
    public BankAccount()
    {
    	balance = 0;
    }
    public void deposit(double amount)
    {
    	System.out.print("Depositing " + amount);
    	double newbalance = balance + amount;
    	System.out.println(", balance is " + newbalance);
    	balance = newbalance;
    }
    public void withdraw(double amount)
    {
    	System.out.print("Withdrawing " + amount);
    	double newbalance = balance-amount;
    	System.out.println(", new balance is " + newbalance);
    	balance = newbalance;
    }
    public double getBalance()
    {
    	return balance;
    }
}
