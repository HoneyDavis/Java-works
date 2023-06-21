package oops;

class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	long salary;
	
	public void printdetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Contactno. is "+phoneno);
		System.out.println("Address is "+address);
		System.out.println("Salary is "+salary);
	}
}

class Employee extends Member
{
	String specialization;
}

class Manager extends Member
{
	String department;
}



public class Inheritanceprgm {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.specialization="developer";
		System.out.println("employee details");
		System.out.println("Employee specialization is "+em.specialization);
		em.name="Honey Davis";
		em.age=31;
		em.phoneno=6235283349l;
		em.address="Chowarakkaran";
		em.salary=25000;
		em.printdetails();
		
		Manager ma=new Manager();
		System.out.println("Manager details");
		ma.department="developing";
		System.out.println("Manager department is "+ma.department);
		ma.name="Joseph Davis";
		ma.age=23;
		ma.phoneno=9747816242l;
		ma.address="Chowarakkaran";
		ma.salary=60000;
		ma.printdetails();
		
		
		

	}

}
