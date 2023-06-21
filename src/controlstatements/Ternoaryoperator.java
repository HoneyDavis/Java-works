
//program to find greater value among 2 numbers using ternory operator

package controlstatements;

public class Ternoaryoperator {

	public static void main(String[] args) {
		int a=50,b=40;
		System.out.println(a>b?a:b);
		
		//another method to print result
		
		int a1=30,b1=40;
		int c=a1>b1?a1:b1;
		System.out.println("greater value is "+c);
		
		//another method to print result
		int a2=20,b2=10;
		String c1=a2>b2?"a2 is greater":"b2 is greater";
		System.out.println(c1);


		}

}
