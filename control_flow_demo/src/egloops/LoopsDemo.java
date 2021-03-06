package egloops;

public class LoopsDemo {

	public static void main(String[] args) {
		
		/*
		 * loop - executes number of times repetedly until certian expression is evaluated successfully
		 * 2 categories of loops
		 * entry controlled - expression will be checked first and then the body of loop will be executed
		 * like for loop, while loop and for each loop
		 * exit controlled -the body of the loop will be executed first and then the expression will be checked like do...while
		 */
		
		for(int i=0;i<=10;i++) {
			System.out.println("i = "+i);
		}
		
		for(int i=0,j=0;i<=10;i++,j--) {
			System.out.println("i = "+i+" j = "+j);
		}
		
		System.out.println("Printing all even numbers between 1 and 50");
		for (int i = 1; i <=50; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n"+Long.MIN_VALUE);
		
		System.out.println("while loop demo");
		int x=0;
		while(x!=10) {
			//++x;
			System.out.println(++x);
			//x++;
		}
		
		x=0;
		
		do {
			System.out.println("I will be executed once for sure");
			//x--;
		}while(x!=0);
		
		System.out.println("FOR EACH DEMO");
		int arr[]= {100,1,23,1,3,13,1233,44,44};
		for(int s:arr) {
			System.out.println(s);
		}

	}

}
