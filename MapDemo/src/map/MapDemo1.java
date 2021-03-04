package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// in map one key can be null
		
		Map<Integer,String> hm=new HashMap<>();
		hm.put(100, "java");
		hm.put(101, "gaurav");
		System.out.println("hm " + hm);
		
		Map<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(100, "java");
		lhm.put(101, "gaurav");
		System.out.println("lhm " + lhm);
		
		

		Map<Integer,String> tm=new TreeMap<>();
		tm.put(100, "java");
		tm.put(101, "gaurav");
		System.out.println("tm " + tm);
		
		
		System.out.println(tm.size());
		System.out.println(tm.containsKey(100));
		System.out.println(tm.containsValue("java"));
		System.out.println(tm.get(100));
		tm.remove(100);
		System.out.println(tm);
		
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		
		

	}

}
