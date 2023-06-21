package controlstatements;

public class Jumpingstatmnts {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				
			{
				break; // when we use break execution will stop,here execution will exit from for loop, means when i become 5 execution of for loop will stop.
			}
			System.out.print(i+"  ");
		}
		System.out.println();
		for(int j=10;j<=20;j++)
		{
			if(j==16)
			{
				continue;// when we use continue in a loop the execution of that particular condition will skip and then continues the execution,here for loop execution will take place till j become 16,when j become 16 execution will stop,then continue printing next numbers,16 will not be displayed.
			}
			System.out.print(j+"  ");
		}

	}

}
