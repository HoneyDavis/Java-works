
//program to add 2 numbers
package scannerprogram;

import java.util.Scanner;

public class Addnumber {

	public static void main(String[] args) {
		System.out.println("enter 2 numbers");
		Scanner add=new Scanner(System.in);
		int a =add.nextInt();
		int b =add.nextInt();
		System.out.println("sum of 2 numbers ="+(a+b));
	}

}
