package oops;

class Animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}

class Dog extends Animal    //to inherit data from one class to another use the keyword 'extends'
{
	public void breed()
	{
		System.out.println("lab");
	}
}

class Babydog extends Dog
{
	public void babydogfeature()
	{
		System.out.println("babydog");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
		Dog ob=new Dog();
		ob.animalfood();
		ob.breed();
		
		Babydog baby=new Babydog();
		baby.animalfood();
		baby.breed();
		baby.babydogfeature();
		
	}

}
