package sampleqstns;

import java.util.Scanner;

public class Stringpaliandrome {

	public static void main(String[] args) {
		String a;
		System.out.println("Enter a string");
		Scanner ob=new Scanner(System.in);
		a=ob.nextLine();
		int n=a.length();
		String t="";
		
		for(int i=n-1;i>=0;i--)
		{
			t=t+a.charAt(i);
		}
		
		if(a.equals(t))
		{
			System.out.println("String is paliandrome");
			
		}
		else
			System.out.println("String is not paliandrome");
		
	}

}
