package controlstatements;

public class Multtables {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("Multiplication table of "+i);
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

	}

}
