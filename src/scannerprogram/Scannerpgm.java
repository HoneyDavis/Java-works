
//program to read and print a number
package scannerprogram;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("entered number is "+a);
	}
}