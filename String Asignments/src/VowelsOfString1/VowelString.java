package VowelsOfString1;

import java.util.Scanner;

public class VowelString {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		isVowel();
	}
		
		static boolean isVowel() {
			Scanner sc=new Scanner(System.in);
			System.out.println("\n enter string");
			String s=sc.nextLine();
			//System.out.println("\n the name is " + s);
			//char[] ar=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					//System.out.println("\n the vowels are" + s.charAt(i) + " at the index " + i);
					return true;
				}else {
					return false;
				}

		}
			return true;
			
		
		
		

	}
}
