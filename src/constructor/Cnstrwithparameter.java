package constructor;

public class Cnstrwithparameter {
	int studentid;
	String name;
	
	public Cnstrwithparameter(int studentid,String name)
	{
		this.studentid=studentid; //here we use 'this.' to avoid confusion if we are using same name for variables
		this.name=name;
	}

	public static void main(String[] args) {
		Cnstrwithparameter ob=new Cnstrwithparameter(20,"honey");
		System.out.println("studentid is "+ob.studentid);
		System.out.println("name is "+ob.name);
		
		
	}

}
