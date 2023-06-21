package scannerprogram;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner paldrm=new Scanner(System.in);
		int a=paldrm.nextInt();
		int temp=a;
		int n=0;
		int r=0;
		while(a>0)
		{
			r=a%10;
			n=(n*10)+r;
			a=a/10;
			
		}
		if(n==temp)
			System.out.println("number is a paliandrome number");
		else
			System.out.println("number is not a paliandrome number");
	}

}
