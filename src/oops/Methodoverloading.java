package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		
		 Methodoverloading ob=new  Methodoverloading();
		 ob.add();
		 ob.add(10,80);
		 ob.add(10,40.5);
		 ob.add(50.6,25);
	}
	
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println("sum = "+c);	
	
	}
	
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum = "+c);	
	}
	
	public void add(int a,double b)
	{
		double c;
		c=a+b;
		System.out.println("sum = "+c);	
	}
	
	public void add(double a,int b)
	{
		double c;
		c=a+b;
		System.out.println("sum = "+c);	
	}

}
