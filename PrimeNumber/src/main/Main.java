package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


