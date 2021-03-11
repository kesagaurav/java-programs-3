package eg1;

import java.util.Scanner;

public class LastCharsToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//String s="string is immutable and stringbuffer is not";
Scanner sc=new Scanner(System.in);
System.out.println("\n enter string");
String s=sc.nextLine();
		
		String ar[] =s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<ar.length;i++) {
			//sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].length()-1,ar.length).append(" " );
			sb.append(ar[i].substring(0, ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");		}
		System.out.println(sb.toString().trim());
	
		
		

	}

}
