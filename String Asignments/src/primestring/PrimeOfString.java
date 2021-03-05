package primestring;

import java.util.Scanner;

public class PrimeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter an string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)%1==0) {
				count++;
			}
		}
		
		System.out.println("the prime characters are" + count);


	}

}
