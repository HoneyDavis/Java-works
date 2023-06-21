package javapackage;

public class Swapping {

	public static void main(String[] args) {
	
	int a1=20,b1=30,temp;
	temp=a1;
	a1=b1;
	b1=temp;
	System.out.println("after swapping value of a1="+a1 +" and value of b1="+b1);
	
	//interview qstn swap 2 values without using a 3rd variable
	
	int a=30,b=50;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swapping by 2nd method");
	System.out.println("after swapping value of a="+a +" and value of b="+b);
	}

}
