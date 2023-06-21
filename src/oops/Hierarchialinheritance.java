package oops;

class Animal1
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
	}
}

class Dog1 extends Animal1
{
	public void dogdetails()
	{
		System.out.println("dog");	
	}
}

class Tiger extends Animal1
{
	public void tigerdetails()
	{
		System.out.println("tiger");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.animaldetails();
		d.dogdetails();
		Tiger t=new Tiger();
		t.animaldetails();
		t.tigerdetails();
		
	}

}
