package MapMapList;

import java.util.*;

public class Task {
	public static void main(String[] args) {
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
//		System.out.println(mh);

		List<String> mp = new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");
//		System.out.println(mp);

		Map<String, List<String>> india = new HashMap<>();
		india.put("mh", mh);
		india.put("mp", mp);
//		System.out.println(india);

		List<String> st1 = new ArrayList<>();
		st1.add("ct1");
		st1.add("ct2");
//		System.out.println(st1);

		List<String> st2 = new ArrayList<>();
		st2.add("ct3");
		st2.add("ct4");
//		System.out.println(st2);

		Map<String, List<String>> japan = new HashMap<>();
		japan.put("St1", st1);
		japan.put("st2", st2);
//		System.out.println(japan);

		Map<String, Map<String, List<String>>> world = new HashMap<>();
		world.put("japan", japan);
		world.put("india", india);
//		System.out.println(world);

//		Set<String> s = world.keySet();
////		System.out.println(s);
//
//		Iterator<String> itr = s.iterator();
//		while (itr.hasNext()) {
//			String st = itr.next();
//			System.out.println(st);
//			Map<String, List<String>> m = world.get(st);
////			System.out.println(m);
//			
//			Set<String> s1 = m.keySet();
////			System.out.println(s1);
//			
//			Iterator<String> itr1 = s1.iterator();
//			while (itr1.hasNext()) {
//				String keys = itr1.next();
//				System.out.println(keys);
//				
//				List<String> li = m.get(keys);
////				System.out.println(li);
//				
//				Iterator<String> itr2 = li.iterator();
//				while (itr2.hasNext()) {
//					String val = itr2.next();
//					System.out.println(val);
//				}
//			}
//
//		}

		world.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);

			v.forEach((k1, v1) -> {
				System.out.println(k1);
				System.out.println(v1);

				v1.forEach((li) ->
				{
					System.out.println(li);
				});
			});
		});
	}

}
