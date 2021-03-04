package set_demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add("java");
		hs.add("jee");
		hs.add("gaurav");
		hs.add("blueeee");
		System.out.println(" hs " + hs);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("hello");
		lhs.add("java");
		lhs.add("jee");
		lhs.add("gaurav");
		lhs.add("blueeee");
		lhs.add(null);
		System.out.println(" lhs " + lhs);
		
		Set<String> ths=new TreeSet<>();
		ths.add("hello");
		ths.add("hello");
		ths.add("java");
		ths.add("jee");
		ths.add("gaurav");
		ths.add("blueeee");
	//	ths.add(null);
		System.out.println(" ths " + ths);
		
		
		System.out.println(ths.contains("vinay"));
		System.out.println(ths.contains("gaurav"));
		System.out.println(ths.size());
		System.out.println(ths.remove("gaurav"));
		System.out.println(ths);
		
		for(String s:ths) {
			System.out.println(s);
		}
		
		
		
	}

}
