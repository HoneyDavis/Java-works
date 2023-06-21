
//program to print fibonacci series of n terms where n is input by user

package sampleqstns;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		System.out.println("enter number of terms for fibonacci series");
		
		Scanner fib=new Scanner(System.in);
		int n=fib.nextInt();
		int i=0;
		int j=1;
		int sum;
		System.out.print(i);
		System.out.print(" "+j);
		for(int k=1;k<=(n-2);k++)
		{
			sum=i+j;
			System.out.print(" "+sum);
			i=j;
			j=sum;
		}
	}

}
