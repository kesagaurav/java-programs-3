package palindrome;

import java.util.Scanner;

public class PalindromeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter nos u wnat to input");
		int n = sc.nextInt();
		System.out.println("\n the nos are " + n);
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
//		int temp=n;
		for(int i=0;i<n;i++) {
			if(isPalindrome(a[i]))
				System.out.println("the list of palindromes are " + a[i] + "");
		}	
		

	}
	
	public static boolean isPalindrome(int a) {
		int r,sum=0,temp = 0;
		 temp=a;
			while(a>0) {
				r=a%10;
				sum=(sum*10)+r;
				a/=10;
				
			} 
			return (temp==sum);
//			
//		if(temp==sum) {
//			System.out.println("\n palindrome");
//		}else {
//			System.out.println("\n not palindrome");
//		}
		
	}
}
	
	


