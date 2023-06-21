package array;

public class Stringchar {

	public static void main(String[] args) {
		
		String s = "Hai how are you";    
        int count = 0;    
            
       
        for(int i = 0; i < s.length(); i++)
        {    
            if(s.charAt(i) != ' ')    
                count++;   
		}
        
        System.out.println("Count f character is "+count);
	}
}


