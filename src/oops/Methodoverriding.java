package oops;

class Car1
{
	public void accelerator()
	{
		System.out.println("accelarator");
	}
}

class BMW1 extends Car1
{

	@Override
	public void accelerator()
	{
		System.out.println("BMW accelarator");
		super.accelerator();
	}
	
	
}



public class Methodoverriding {

	public static void main(String[] args) 
	{
		BMW1 ob=new BMW1();
		ob.accelerator();
	}

}
