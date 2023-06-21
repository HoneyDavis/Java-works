
//program to create an array and enter values, then print the numbers

package array;

public class Arraycreation {

	public static void main(String[] args) {
	
		int ar[]=new int[3];
		ar[0]=4;
		ar[1]=6;
		ar[2]=10;
		
		System.out.println("entered numbers are");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
