package loopdemo;

public class LoopDemo1 {

	public static void main(String[] args) {
		// for loop 
		for(int i=0;i<100;i+=2) {
			System.out.println("\n print the alternate elements are:" + i);
		}
		
		//while loop
		int num=1234,reverse=0;
		
		while(num!=0) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
			remainder/=10;
			
		}
		System.out.println("reverse of a number is:" + reverse);
		
		
	

	}

}
