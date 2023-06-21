package oops;

class Access extends Accessmodifier
{
	
}

interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();

}
class SBI implements Bank
{
 public void deposit()
 {
	 System.out.println("SBI deposit");
 }
 public void withdraw()
 {
	 System.out.println("SBI withdraw"); 
 }
 public void balance()
 {
	 System.out.println("SBI balance");
 }
}

class Federal implements Bank
{
	public void deposit()
	 {
		 System.out.println("Federal deposit");
	 }
	 public void withdraw()
	 {
		 System.out.println("Federal withdraw"); 
	 }
	 public void balance()
	 {
		 System.out.println("Federal balance");
	 }
}
public class Interface {

	public static void main(String[] args) {
		Bank ob=new SBI(); // we can create object reference for an interface,so here class Federal also can use the object ob to call methods
		ob.deposit();
		ob.withdraw();
		ob.balance();

		ob=new Federal();
		ob.deposit();
		ob.withdraw();
		ob.balance();
	Accessmodifier sc=new Accessmodifier();
	System.out.println(sc.b);
	Access ob1=new Access();
	System.out.println(ob1.c);
	}

}
