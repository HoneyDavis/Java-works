
//program to read an integer and then outputs the number with the digits reversed.

package sampleqstns;

import java.util.Scanner;

public class Reverseorder {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner rev=new Scanner(System.in);
		int a=rev.nextInt();
		int n=0;
		int r=0;
		while(a>0)
		{
			r=a%10;
			n=(n*10)+r;
			a=a/10;
			
		}
		System.out.println("reverse of the number is "+n);
	}

}
