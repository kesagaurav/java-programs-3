package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hm=new HashMap<>();
		hm.put(100, "java");
		hm.put(101, "gaurav");
		System.out.println("map before deletion : " );
		System.out.println(hm);
		
		Iterator<Entry<Integer,String>> i=hm.entrySet().iterator();
		
//		for(Entry<Integer,String> e:hm.entrySet()) {
//			if(e.getKey()==null||e.getValue()==null) {
//				hm.remove(e.getKey());
//			}
//		}
		
		
		while(i.hasNext()) {
			Entry<Integer,String> e=i.next();
			if(e.getKey()==null||e.getValue()==null) {
				i.remove();
			}
		}
		
		
		System.out.println("map after deletion : " );
		System.out.println(hm);
	}

}
