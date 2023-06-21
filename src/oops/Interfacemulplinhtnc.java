package oops;

interface Bank2
{
	public void deposit();
	public void withdraw();
	public void balance();

}

interface Creditcard
{
	public void creditcarddetails();
	
}

class SBT implements Bank2,Creditcard // in interface multipleinheritance is possible,means a class can access details of 2 different interfaces 
{
	@Override
 public void deposit()
 {
	 System.out.println("SBT deposit");
 }
	@Override
 public void withdraw()
 {
	 System.out.println("SBT withdraw"); 
 }
	@Override
 public void balance()
 {
	 System.out.println("SBT balance");
 }
@Override
public void creditcarddetails() 
{
	System.out.println("SBT creditcard details");
	
}
}



public class Interfacemulplinhtnc {

	public static void main(String[] args) {
		 SBT ob=new SBT();
		ob.deposit();
		ob.withdraw();
		ob.balance();
        ob.creditcarddetails();
	}

}
