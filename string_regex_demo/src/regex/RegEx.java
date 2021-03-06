package regex;

public class RegEx {

	public static void main(String[] args) {
		/*
		 * Regular Expression(Reg-ex) it is a pattern matching algorithm by using various wild card characters
		 * 
		 * [] - expression
		 * {} - length
		 * ^ - negation
		 * [a-z]{5} - any word of lowercase of length 5
		 * [a-zA-Z]{10} - any word of length 10   
		 * [0-9]{2,5} - any digit of minimum 2 or maximum of 5  10-99999
		 * [A-Z]{1,} - min 1 uppercase letter sould be there
		 * [^a-zA-Z] - apart from alphabets anything else is allowed
		 */
		String s="A A12   3k1 2& &*99d)K) s :";
		
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[^A-Z]", ""));
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", ""));
	}

}
