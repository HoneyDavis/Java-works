

//program to print * in a pattern

package controlstatements;

public class Nestedforqstn {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)   // or for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
