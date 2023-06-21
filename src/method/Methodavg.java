
//program to find average of 3 numbers using a method

package method;

import java.util.Scanner;


public class Methodavg {

	public static void main(String[] args) {
		System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Methodavg ob=new Methodavg();
		System.out.println("average of entered numbers = "+ob.average(a,b,c));
		

	}
	
	public double average(int a,int b,int c)
	{
		double avg=(a+b+c)/3;
		return avg;
	}

}
