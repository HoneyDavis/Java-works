
//program to print a number in reverse (ie print number 3456 as 6543)

package controlstatements;

public class Reverseorderprgm {

	public static void main(String[] args) {
		int i=3456;
		int n=0;
		int r=0;
	while(i>0)
	{
			r=i%10;
			i=i/10;
			n=(n*10)+r;

		}
			
		System.out.println("reverse of the number 3456 is "+n);
	}

}
