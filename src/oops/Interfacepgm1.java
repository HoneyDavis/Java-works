package oops;

import java.util.Scanner;

interface Bank1
{
	public void showdetails(long n);
	public void balance();
	public void deposit(long d);
	public void withdraw(long w);
}

class Axis implements Bank1
{
	long balance=200000l;
	
	@Override
	public void showdetails(long n)
	{
			System.out.println("Bank name - Axis Bank");
			System.out.println("Account holder name - Honey Davis");
			System.out.println("Account number - "+n);
			
	}

	@Override
	public void balance()
	{
		System.out.println("Current balance - "+balance);
	}

	@Override
	public void deposit(long d)
	{
		balance=balance+d;
		System.out.println("Balance after deposit - "+balance);
		
	}
	
	@Override
	public void withdraw(long w)
	{
		if(w>balance)
			System.out.println("Insufficient balance");
		else
		{
		balance=balance-w;
		System.out.println("Balance amount after withdrawal - "+balance);
		}
	}
}

public class Interfacepgm1 {

	public static void main(String[] args) {
		System.out.println("Enter account number");
		Scanner ob=new Scanner(System.in);
		long a=ob.nextLong();
		Axis sc=new Axis();
		sc.showdetails(a);
		sc.balance();
		System.out.println("Enter the amount to be deposited");
		long b=ob.nextLong();
		sc.deposit(b);
		System.out.println("Enter the amount want to withdraw");
		long c=ob.nextLong();
		sc.withdraw(c);
		
		
		
	}

}
