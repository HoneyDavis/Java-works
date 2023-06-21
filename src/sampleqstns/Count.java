
//program to enter numbers till the user wants and find the count of positive,negative numbers and zeros entered

package sampleqstns;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		System.out.println("enter the count of numbers want to enter");
		Scanner count=new Scanner(System.in);
		int c=count.nextInt();
		int p=0;
		int n=0;
		int z=0;
		for(int i=1;i<=c;i++)
		{
			int a=count.nextInt();
			if(a>0)
			p++;
			if(a<0)
			n++;
			if(a==0)
			z++;
		}
		
System.out.println("count of positive numbers = "+p);
System.out.println("count of negtive numbers = "+n);
System.out.println("count of zeros = "+z);
	}

}
