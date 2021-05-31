package java_basic_day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// 보통 상위클래스 Map으로 선언.
		// HashMap
		Map<String, Integer> hmap = new HashMap<String, Integer>();
				
		hmap.put("z", 1);
		hmap.put("q", 1);
		hmap.put("d", 1);
		hmap.put("a", 1);
		hmap.put("b", 1);
		hmap.put("c", 2);
		hmap.put("c", 3);
		hmap.put("a", 9);
		
		Iterator<String> ir = hmap.keySet().iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			int value = hmap.get(key);
			System.out.println(key + ":" + value);
		}
		
		// TreeMap : 정렬됨.
		Map<String, Integer> tmap = new TreeMap<String, Integer>();
		
		tmap.put("z", 1);
		tmap.put("q", 1);
		tmap.put("d", 1);
		tmap.put("a", 1);
		tmap.put("b", 1);
		tmap.put("c", 2);
		tmap.put("c", 3);
		tmap.put("a", 9);
		
		Iterator<String> ir2 = tmap.keySet().iterator();
		while(ir2.hasNext()) {
			String key = ir2.next();
			int value = tmap.get(key);
			System.out.println(key + ":" + value);
		}
		
		
	}

}
