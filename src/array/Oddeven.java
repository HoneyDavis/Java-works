package array;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		int a[]=new int[6];
		System.out.println("enter numbers");
		Scanner ob=new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			a[i]=ob.nextInt();
			
			}
		System.out.println("Even numbers are");
			for(int i=0;i<6;i++)
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
			System.out.println("Odd numbers are");
			for(int i=0;i<6;i++)
				if (a[i]%2!=0)
				{
					System.out.println(a[i]);
				}
		}

	}


