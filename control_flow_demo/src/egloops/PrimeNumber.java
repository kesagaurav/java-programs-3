package egloops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("isPrime(2) : "+isPrime(2));
		System.out.println("isPrime(4) : "+isPrime(4));
		
		System.out.println("printing prime numbers between 1 and 100");
		for (int i = 1; i <=100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	public static boolean isPrime(int n) {
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
//Assignments
/* 1)Try all the loops by yourself with some use case of your own
 * 2)Print all the palindrome numbers between 100 and 999
 * 3)Find all the odd numbers between 100 and 199
 * 4)Find the sum of all even numbers between 1 and 100, also find sum of all odd numbers between 1 and 100 and print the results and
 * print which is largest among them(between evensum and oddsum) 
 */
