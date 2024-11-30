package task1;

import java.util.*;

public class Test {
	public static void main(String args[]) {
		Map<Integer, String> m = new HashMap<>();
		m.put(5, "aa");
		m.put(3, "cc");
		m.put(4, "dd");
		m.put(3, "bb");

		m.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
//		Set<Integer> s = m.keySet();
//		System.out.println(s);
//
//		Iterator<Integer> itr = s.iterator();
//		while (itr.hasNext()) {
//			int i = itr.next();
//			System.out.println(i);
//			String st = m.get(i);
//			System.out.println(st);
//		}
	}

}
