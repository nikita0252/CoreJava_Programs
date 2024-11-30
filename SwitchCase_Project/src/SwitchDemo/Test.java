package SwitchDemo;
import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice:");
	        char ch = sc.next().charAt(0);
	        
	        switch(ch)
	        {
	        case 'a' :
	        case 'e' :
	        case 'i' :
	        case 'o' :
	        case 'u' :
	        	System.out.println("This is vowel");
	            break;
	        default :
	        	System.out.println("This is consonants");
	        }
		
			
		}
		
	}

}
