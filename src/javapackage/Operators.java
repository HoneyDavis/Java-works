package javapackage;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operator
		int a=40,b=20;
		System.out.println("Arithmetic operator");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));//reminder value after dividing a and b is getting when do a%b
		//Assignment operator
		int c=60,d=40;
		System.out.println("Assignment operator");
		System.out.println("c+=d is"+(c+=d));
		System.out.println("c-=d is"+(c-=d));
		System.out.println("c*=d is"+(c*=d));
		System.out.println("c/=d is"+(c/=d));
		
		//Relational operator
		int e=50,f=30;
		System.out.println("Relational operator");
		System.out.println(e>f);
		System.out.println(e<f);
		System.out.println(e>=f);
		System.out.println(e<=f);
		System.out.println(e!=f);
		System.out.println(e==f);
		
		//Logical operator
		String username="abc";
		String psw="456";
		System.out.println("logical operator");
		System.out.println(username=="abc" && psw=="456");
		System.out.println(username=="abc" || psw=="456");
		System.out.println(username=="abc" && psw=="3456");
		System.out.println(username=="abc" || psw=="3456");
		System.out.println(!(username=="abc"));
		System.out.println(!(psw=="456"));
		
		
		//Unary operator
		int a1=6;
		System.out.println("Unary operator");
		System.out.println(a1++);
		System.out.println(a1);
		System.out.println(++a1);
		System.out.println(a1--);
		System.out.println(a1);
		System.out.println(--a1);
		

	}

}
