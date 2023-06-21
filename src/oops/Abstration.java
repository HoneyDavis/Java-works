package oops;

abstract class Car
{
	abstract public void speedlimit();
	public void carengine()
	{
		System.out.println("car engine");
	}
}

class Maruti extends Car
{
	@Override
	public void speedlimit()
	{
		System.out.println("maruti speedlimit");
	}
}

class BMW extends Car
{
	@Override
	public void speedlimit()
	{
		System.out.println("BMW speedlimit");
	}
}

public class Abstration {

	public static void main(String[] args) {
		Maruti ob=new Maruti();
		ob.carengine();
		ob.speedlimit();
		BMW ob1=new BMW();
		ob1.speedlimit();

	}

}
