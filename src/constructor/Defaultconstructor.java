package constructor;

public class Defaultconstructor {
	
	int studentid;
	
	public Defaultconstructor()  //constructor to initialize value in an instance variable
	{
		studentid=19;
	}

	public static void main(String[] args) {
		Defaultconstructor ob=new Defaultconstructor();
		System.out.println("studentid = "+ob.studentid);
		

	}

}
