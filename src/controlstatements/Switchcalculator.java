
//program to perform calculator function according to the given choice

package controlstatements;

public class Switchcalculator {

	public static void main(String[] args) {
		int a=20,b=4;
		int c=4;
		switch(c)
		{
		case 1:System.out.println("sum is "+(a+b));
		break;
		case 2:System.out.println("subtraction is "+(a-b));
		break;
		case 3:System.out.println("multiplication is "+(a*b));
		break;
		case 4:System.out.println("division is "+(a/b));
		break;
		default:System.out.println("invalid choice");
		}

	}

}
