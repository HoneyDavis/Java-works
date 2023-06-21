package oops;

interface Readymade
{
	public void saree();
	public void salwar();
	void shirt();
}

interface Stitching
{
	public void kurti();
}

class Theresa implements Readymade,Stitching
{

	@Override
	public void kurti() {
		System.out.println("kurti");
		
	}

	@Override
	public void saree() {
		System.out.println("kurti");
		
	}

	@Override
	public void salwar() {
		System.out.println("kurti");
		
	}

	@Override
	public void shirt() {
		System.out.println("kurti");
		
	}
	
}

public class Interfacepractice {

	public static void main(String[] args) {
		Theresa ob=new Theresa();
		ob.saree();
		ob.salwar();
		ob.shirt();
		ob.kurti();
	}

}
