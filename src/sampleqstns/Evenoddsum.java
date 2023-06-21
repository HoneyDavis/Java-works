
//program to read set of numbers and find sum of even and odd numbers

package sampleqstns;

import java.util.Scanner;

public class Evenoddsum {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		System.out.println("enter 10 numbers");
		Scanner num=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
			int a=num.nextInt();
			if(a%2==0)
				sum1=sum1+a;
			else
				sum2=sum2+a;	
		}
		
System.out.println("sum of even numbers = "+sum1);
System.out.println("sum of odd numbers = "+sum2);

	}

}
