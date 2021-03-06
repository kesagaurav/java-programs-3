package primestring;

import java.util.Scanner;

public class PrimeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(isPrime(i)) {
				System.out.println("the prime number  " + s.toUpperCase().charAt(i-1) +  " and which is at the index of " + i);
			}
		}
		
	
	}
	
	
	static boolean isPrime(int n) {
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}else {
			return false;
		}
	}
		
			
			

	

}
