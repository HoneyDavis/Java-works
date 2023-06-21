
//program to read string values of array and print the values

package array;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String ar[]=new String[5];
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("entered values are");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		

	}

}
