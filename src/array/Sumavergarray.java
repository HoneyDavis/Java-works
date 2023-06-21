
//program to find sum and average of values of an array

package array;

import java.util.Scanner;

public class Sumavergarray {

	public static void main(String[] args) {
		int a[]=new int[5];
		double sum=0;
		double avg=0;
		System.out.println("enter 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		avg=sum/5;
		System.out.println("sum of entered numbers = "+sum);
		System.out.println("average of entered numbers = "+avg);

	}

}
