package method;

public class Shapes {

	public static void main(String[] args) {
	Shapes ob=new Shapes();
	ob.tri();
	System.out.println("area of rectagle = "+ob.rect());
	double a=ob.cir(4);
	System.out.println("area of circle = "+a);
	ob.squ(2);
	

	}
	//without returntype and parameter
	
	public void tri()
	{
		int b=4;
		int h=6;
		double area=0.5*b*h;
		System.out.println("area of triangle = "+area);
		
		
	}
	
	//with return type and without parameter
	
	public int rect()
	{
		int l=12;
		int b=6;
		int area=l*b;
		return area;
	}
	
	//with returntype and parameter
	
	public double cir(int r)
	{
		double area=3.14*r*r;
		return area;
	}
	
	//without returntype and with parameter
	
	public void squ(int a)
	{
		double area=a*a;
		System.out.println("area of square = "+area); 
	}

}
