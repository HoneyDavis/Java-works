
//program to read a positive number and check whether the number is a prime number or not

package sampleqstns;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("enter a positive number");
		
		Scanner prime=new Scanner(System.in);
		int a=prime.nextInt();
		int temp=a;
		int j=0;
		
		if(a>1)
		{
			for(int i=2;i<a;i++)
			{
				if((a%i)==0)
				{
				j++;
				break;
				}
				else
					a=temp;
			
			}
		}
		
		if(a==1 || j!=0)
			System.out.println("entered number is not a prime number");
		else
			System.out.println("entered number is a prime number");
			
			

	}

}
