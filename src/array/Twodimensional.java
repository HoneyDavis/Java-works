package array;

import java.util.Scanner;

public class Twodimensional {

	public static void main(String[] args) {
		System.out.println("enter values of array");
		Scanner array=new Scanner(System.in);
		int ar[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=array.nextInt();
			}
		}
		System.out.println("entered values of array are");	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
