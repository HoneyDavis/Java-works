
//modify value of a (a=12) using unary operator

package sampleqstns;

public class Modify {

	public static void main(String[] args) {
		int a=12;
		int temp=a;
		System.out.println("value of a after increment is "+(++a));// to print the increment value we should give ++ before the variable,if we provide it after variable the same value will print first then increment operation will perform
		System.out.println("value of a after decrement is "+(--temp));
	
		
	}

}
