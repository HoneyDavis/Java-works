
//program to take 10 integers from keyboard using loop and print their average value

package sampleqstns;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("enter 10 numbers");
		Scanner avg=new Scanner(System.in);
		double average;
		double sum=0;
		for(int i=1;i<=10;i++)
		{
			int a=avg.nextInt();
			sum=sum+a;
			
		}
		average=sum/10;
		System.out.println("average of entered numbers = "+average);
	}

}
