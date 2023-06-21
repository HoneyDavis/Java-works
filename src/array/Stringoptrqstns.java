package array;

import java.util.Scanner;

public class Stringoptrqstns {

	public static void main(String[] args) {
		String s="jmeter";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s2=sc.nextLine();

		if(s2.contains("language"))
		{
			System.out.println("the word language is present in the entered string");
		}
		else
			System.out.println("the word language is not present in the entered string");

	}

}
