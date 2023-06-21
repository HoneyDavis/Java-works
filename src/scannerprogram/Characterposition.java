
//program to print character at a given position in a word
package scannerprogram;

import java.util.Scanner;

public class Characterposition {

	public static void main(String[] args) {
		System.out.println("Enter a name");
		Scanner name=new Scanner(System.in);
		char c=name.next().charAt(3);//position of character is counting from 0 so when we ask for 3rd position output will be 4th position
		System.out.println("Character at 4th position is "+c);

	}

}
