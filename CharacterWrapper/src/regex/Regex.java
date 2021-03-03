package regex;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="A A12 3K1 2& &*99Kd)K) s";
		
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-z]", ""));
		System.out.println(s.replaceAll("[^A-Z]", "").length());

	}

}
