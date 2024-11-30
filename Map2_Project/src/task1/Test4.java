package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(null);
		li.add(null);
		System.out.println(li);
		
		li.forEach((l)->System.out.println(l));
		
		
		Set<Integer> l=new HashSet<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(null);
		l.add(null);
		System.out.println(l);
		l.forEach((la)->System.out.println(la));
	}
}
