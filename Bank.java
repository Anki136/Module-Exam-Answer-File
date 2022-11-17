import java.util.Scanner;
public class BankAccount
{
	int acc_no;
	double balance;
	BankAccount(int acc_no,double balance)
	{
		this.acc_no=acc_no;
		this.balance=balance;
	}
	void withdraw(double amt)
	{
		if(balance>amt)
		{
			balance=balance-amt;
			System.out.println("Balance after withdrawal :"+balance);
		}
	}
	void deposit(double amt)
	{
			balance=balance+amt;
			System.out.println("Balance after deposition :"+balance);
	}
	void show()
	{
		System.out.println("Account no is: "+acc_no+" and balance is: "+balance);	
	}
}
class Bank
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the acc and balance :");
			int acc=sc.nextInt();
			double bal=sc.nextDouble();
			System.out.println("Enter the withdraw amount :");
			double Withdraw=sc.nextInt();
			
			BankAccount ba=new BankAccount(acc,bal);
		     
			if(bal<withdraw)
               throw new Exception("Error: Insufficient balance");		   
		}
		catch(Exception e)
		{
			System.out.println("Insufficient balance");
		}
	}
}