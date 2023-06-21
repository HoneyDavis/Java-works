package array;

public class Stringsmplqstn {

	public static void main(String[] args) {
		String s="selenium webdriver is used for webapplication testing";
		String a[]=s.split(" ");
		for(String s1:a)
		{
			System.out.println(s1);
			if(s1.contains("webapplication"))
				break;
		}
		

	}

}
