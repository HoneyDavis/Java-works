package sample;

import java.util.Scanner;

interface Bank
{
	public void showdetails(String name);
	public void balance();
	public void deposit();
	public void withdraw();
	
}

class Axis implements Bank
{
	static String bankname="Axis";
	int acn;
	int balance=200000;
	Scanner sc=new Scanner(System.in);

	@Override
	public void showdetails(String name) 
	{
		System.out.println("Bank name - "+bankname);
		System.out.println("Enter your account number");
		acn=sc.nextInt();
		System.out.println("Account number - "+acn);
		System.out.println("Account holder name"+name);
		
		
	}

	@Override
	public void balance() 
	{
		System.out.println("Balance - "+balance);
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Enter your deposit amount");
		int d=sc.nextInt();
		balance=balance+d;
		System.out.println("Balance after withdrawal - "+balance);
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("Enter your withdrawal amount");
		int amount=sc.nextInt();
		balance=balance-amount;
		System.out.println("Balance after withdrawal - "+balance);
		
	}
	
}

public class Sample {

	public static void main(String[] args) {
		Axis ob=new Axis();
		ob.showdetails("Honey");
		ob.balance();
		ob.deposit();
		ob.withdraw();

	}

}
