package task1;

import java.util.HashMap;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(null, null);
		m.put(6, null);
		m.put(2, 2);
		m.put(3, 3);
		System.out.println(m);
	}
}
