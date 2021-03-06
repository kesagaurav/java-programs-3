package eg1;

public class CharacterWrapper {

	public static void main(String[] args) {
		
		String s="A A12   3k1 2& &*99d)K) s :";
		int alpha=0,upper=0,lower=0,digit=0,alphanum=0,spaces=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				spaces++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		
		System.out.println("Alpha count is : "+alpha);
		System.out.println("Upper count is : "+upper);
		System.out.println("Lower count is : "+lower);
		System.out.println("Digit count is : "+digit);
		System.out.println("Alphanumeric count is : "+alphanum);
		System.out.println("Whitespaces count is : "+spaces);
		System.out.println("Special char count is : "+special);

	}

}
