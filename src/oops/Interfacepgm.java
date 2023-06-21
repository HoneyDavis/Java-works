package oops;

class Monkey
{
	public void jump()
	{
		System.out.println("monkey feature jump");
	}
	
	public void bite()
	{
		System.out.println("monkey feature bite");
	}
}

class Human extends Monkey implements Basicanimal
{
	public void speak()
	{
		System.out.println("human feature speak");
	}

	@Override
	public void eat() {
		System.out.println("basic animal feature eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("basic animal feature sleep");
		
	}
	
}

interface Basicanimal
{
	public void eat();
	public void sleep();
}

public class Interfacepgm {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.jump();
		ob.bite();
		ob.speak();
		ob.eat();
		ob.sleep();

	}

}
