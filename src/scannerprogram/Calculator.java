package scannerprogram;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		System.out.println("enter 2 numbers");
		Scanner cal=new Scanner(System.in);
		double a=cal.nextInt();
		double b=cal.nextInt();
		System.out.println("enter your choice 1.add 2.subtraction 3.muliplication 4.division");
		int c=cal.nextInt();
		double r=0;
		switch(c)
		{
		case 1:r=a+b;
		break;
		case 2:r=a-b;
		break;
		case 3:r=a*b;
		break;
		case 4:if(b==0)// if b=0 then division can not be done, so here we need to check it first.
		{
			System.out.println("error");
			
		}
		else
			r=a/b;
		break;
		default:System.out.println("invalid choice");
		}
		System.out.println(r);
	}

}
