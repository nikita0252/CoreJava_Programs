package example;

import java.util.*;

public class Ex_2 
{
	public static void main(String[] args) {
		
		List <Integer> al = new ArrayList();
		al.add(10);
		al.add(34);
		al.add(10);
		al.add(34);
		
		//Iterator <Integer> itr = al.iterator();
		 for(int x : al)
		 {
			 System.out.println(x);
		 }
	}

}
