package example;

import java.util.ArrayList;
import java.util.List;

public class Ex_3 
{
public static void main(String[] args) {
		
		List <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(34);
		al.add(10);
		al.add(34);
		
		
		 for(int i=0; i<al.size();i++)
		 {
			 System.out.println(al.get(i));
		 }
	}

}
