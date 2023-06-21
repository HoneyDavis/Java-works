package method;

public class Methodpgm {

	public static void main(String[] args) {
		Methodpgm sc=new Methodpgm();
		sc.add();
		System.out.println("difference of 2 numbers = "+sc.sub()); //otherwise int s=sc.sub(); System.out.println("difference of 2 numbers = "+s);
		int m=sc.mult(10,3);
		System.out.println("multiplication of 2 numbers = "+m);
		sc.div(30,5);
		
		
	}
//1.method without returntype and without parameter
		
		public void add()
		{
			int a=30,b=20;
			int c=a+b;
			System.out.println("sum of 2 numbers = "+c);
		}
		
//2.method with returntype and without parameter
		
		public int sub()
		{
			int a=30,b=20;
			int c=a-b;
			return c;
		}
		
//3.method with returntype and with parameter
		
		public int mult(int a,int b)
		{
			int c=a*b;
			return c;
		}

//4.method without returntype and with parameter
		
		public void div(double a,double b)
		{
			System.out.println("division of 2 numbers = "+(a/b));
		}

}
