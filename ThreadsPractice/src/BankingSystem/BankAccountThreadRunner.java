package BankingSystem;

public class BankAccountThreadRunner {
  public static void main(String[] args)
  {
	  BankAccount account = new BankAccount();
	  final double AMOUNT = 100;
	  final int REPITITION = 100;
	  final int THREADS = 100;
	  for(int i=1; i<=REPITITION;i++)
	  {
		  DepositRunnable d = new DepositRunnable(account,AMOUNT,REPITITION);
		  WithdrawRunnable w = new WithdrawRunnable(account,AMOUNT,REPITITION);
		  
		  Thread dt = new Thread(d);
		  Thread wt = new Thread(w);
		  
		  dt.start();
		  wt.start();
	  }
  }
}
