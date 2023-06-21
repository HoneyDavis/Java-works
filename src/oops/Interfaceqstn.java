
//create an interface TVremote and inherit TVremote to another interface smarttvremote.then create a class Tv and 
//implement that class from smarttvremote.

package oops;

interface Tvremote
{
	public void tvremote();
}
interface Smarttvremote extends Tvremote
{
	public void smarttv();
}

class Tv implements Smarttvremote
{
	@Override
	public void tvremote()
	{
		System.out.println("tv remote");
	}
	@Override
	
	public void smarttv()
	{
	System.out.println("smarttv remote");
	}
	
}


public class Interfaceqstn {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.tvremote();
		ob.smarttv();

	}

}
