package array;

public class Stringoperators {

	public static void main(String[] args) {
		String s="hello";
		String s1="Good morning";
		String s3="how are you";
		String s4="Hello";
		String s5="    welcome";
		
		//concatenation--to add 2 strings
		
		System.out.println(s.concat(s1));
		System.out.println(s+s1); // by using + also we can add 2 strings
		System.out.println(1+2+s+4+6); // here output will be 3hello46 ---bcz here, first + sign will be take as add operator so 1 will add to 2 
		//then string will append with 3, + sign coming after a string will be taken as appending not as add operator. 

		//equal
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s4));
		System.out.println(s.equalsIgnoreCase(s4));
		
		//contains
		
		System.out.println(s1.contains("Good"));
		
		//touppercase & tolowercase
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//trim
		
		System.out.println(s5.trim());  //to trim the space before and after a word
		
		
		//length
		System.out.println(s.length());
		
		//startswith
		
		System.out.println(s3.startsWith("how"));
		
		//endswith
		
		System.out.println(s3.endsWith("you"));
		
		//substring
		
		System.out.println(s.substring(1,5)); //space will not count,
		//here characters between 1 and 5 will print(1st and 5th character will not print)
		
		//charAt
		
		System.out.println(s3.charAt(4));
		
		//split---to split a sentence 
		
		String ar[]=s3.split(" ");  //split("here we need to give at what splitting wants to do") here splitting is doing when space is coming so split(" ")
		for(String v:ar)
		{
			System.out.println(v);
		}
	}

}
