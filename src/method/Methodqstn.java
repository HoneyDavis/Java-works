package method;

import java.util.Scanner;

public class Methodqstn {

	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Methodqstn ob=new Methodqstn();
		ob.sumofinteger(a);

	}
	
	public void sumofinteger(int n)
	{
		int sum=0;
		while(n>0)
		{
		sum=sum+(n%10);
		n=n/10;
		}
		System.out.println("sum of integers = "+sum);
	}
}