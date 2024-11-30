package MapList;

import java.util.*;

public class Test {
	public static void main(String args[]) {
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Nagar");

		List<String> mp = new ArrayList<>();
		mp.add("Bhopal");
		mp.add("aa");

		Map<String, List<String>> ind = new HashMap<>();
		ind.put("mh", mh);
		ind.put("mp", mp);
//		System.out.println(ind);

		Set<String> s = ind.keySet();
//		System.out.println(s);
		
		ind.forEach((k,v)->{
			System.out.println(k+" "+v);
			
			v.forEach((li)->{
				System.out.println(li);
			});
			
		});

//		Iterator<String> itr = s.iterator();
//		while (itr.hasNext()) {
//			String st = itr.next();
//			System.out.println(st);
//			List<String> li = ind.get(st);
//
//			Iterator<String> itr1 = li.iterator();
//			while (itr1.hasNext()) {
//				String ss = itr1.next();
//				System.out.println(st + " " + ss);
//			}
//		}
		
		

	}

}
