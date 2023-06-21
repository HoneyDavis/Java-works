
//program to read values of array and print the numbers

package array;

import java.util.Scanner;

public class Arrayvaluereading {

	public static void main(String[] args) {
		int ar[]=new int[3];
		System.out.println("entered numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("entered numbers are");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
