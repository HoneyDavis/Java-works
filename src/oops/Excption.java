package oops;

public class Excption {

	public static void main(String[] args) {

try
{
	int a=20,b=0;
	int c=a/b;
	System.out.println(c);
}

catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("arithmetic exception"); //no need to give this as we have provided e.getMessage to get a message for the exception
                                                // if we want display a message by ourselves we can add this line
}


try
{
	int a[]=new int[2];
	a[0]=1;
	a[1]=4;
	System.out.println(a[3]);
}

catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("arithmetic index boundof");
}

try
{
	String s=null;
	System.out.println(s.length());
}

catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("string has no value");
}

	}

}
