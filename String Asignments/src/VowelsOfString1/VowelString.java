package VowelsOfString1;

import java.util.Scanner;

public class VowelString {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
	
		isVowel();
		
	
	}
	
	
	public static boolean isVowel() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter string");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o' || a.charAt(i)=='u') {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
		
			
			
		
		
		
}
	

