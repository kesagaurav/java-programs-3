package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li=new LinkedList();
		li.add("guarav");
		li.add(12);
		li.add('r');
		li.add(true);
		System.out.println(li);
		
		List<Integer> li2=new LinkedList<>();
		li2.add(990);
		li2.add(991);
		li2.add(992);
		li2.add(993);
		li2.add(1, 800);// insert at any specific position
		li2.add(null);
		System.out.println(li2);
		
		li2.set(1, 1000);// update an value using specified positions
		System.out.println("li2:" + li2);
		System.out.println(li2.size());
		System.out.println(li2.get(4));
		System.out.println("\n accessing all the elements using for loop");
		
		for(int i=0;i<li2.size();i++) {
			System.out.println(li2.get(i));
		}
		System.out.println("\n accessing all the numbers");
		for(Integer i:li2) {
			System.out.println(i);
		}
		
		li2.remove(1);// removes element from 0th index
		System.out.println("removed " + li2);
		
		Integer i=990;
		li2.remove(i);
		
		Collections.shuffle(li2);
		System.out.println("collections are  " + li2);
		
		Collections.reverse(li2);
		System.out.println("reverse elements are  "+ li2);
		//System.out.println(li2);
		while(li2.remove(i)) {
			System.out.println(li2);
		}
		
		System.out.println(li2.contains(992));
		
		Collections.replaceAll(li2, null, -1);
		Collections.sort(li2);

		System.out.println(li2);
		
		Collections.sort(li2,Collections.reverseOrder());
		
		
		List<Integer> li3=new ArrayList<>(li2);
		li3.addAll(li3);
		System.out.println(li3);
		
		
		li3.add(700);
		li3.add(55);
		
		li3.add(2900);
		li3.add(5500);
		
		li2.add(33);
		li2.add(44);
		
		System.out.println("li2 " + li2);
		System.out.println( "li3 " + li3);
		
		li3.retainAll(li2);//common in the 2 lists will be printed
		System.out.println("\n after reating" + li3);
		
		li3.removeAll(li2);//finds the contents of li3 which are not there in li2
		System.out.println("remove" + li3);
	}

}
