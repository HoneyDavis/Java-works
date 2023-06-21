
//program to print name with space (like Honey Davis)
package scannerprogram;

import java.util.Scanner;

public class Nameprint {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner name=new Scanner(System.in);
		String a=name.nextLine();
		System.out.println("My name is "+a);

	}

}
