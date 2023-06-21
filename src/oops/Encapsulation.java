package oops;

class Empl
{
	private String empname;
	private String designation;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Empl ob=new Empl();
		ob.setEmpname("Josu");
		ob.setDesignation("Tester");
		System.out.println("Employee name - "+ob.getEmpname());
		System.out.println("Employee designation - "+ob.getDesignation());
		

	}

}
