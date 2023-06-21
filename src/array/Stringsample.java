package array;

import java.util.Scanner;

public class Stringsample {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
				for(int i=0;i<(s.length());i++)
				{
					if(s.charAt(i)=='a')
					count++;
					
					else if(s.charAt(i)=='e')
						count++;
					
					else if(s.charAt(i)=='i')
						count++;
					
					else if(s.charAt(i)=='o')
						count++;
					
					else if(s.charAt(i)=='u')
						count++;
				}
		System.out.println("count of vowels = "+count);
	}

}
