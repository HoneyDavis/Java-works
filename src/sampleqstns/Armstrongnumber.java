
//program to check a 3 digit number is armstrong number or not

package sampleqstns;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		System.out.println("enter a 3 digit number");
		Scanner atg=new Scanner(System.in);
		int a=atg.nextInt();
		int temp=a;
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			a=a/10;
			int n=1;
			for(int j=1;j<=3;j++)
			{
				n=n*r;
			}
			sum=sum+n;
		}
		if(sum==temp)
			System.out.println("entered number is an armstrong number");	
		else
			System.out.println("entered number is not an armstrong number");	

	}

}
