package eg1;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i am a very good programmer";
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				System.out.println("at even is" + s.toUpperCase().charAt(0));
			}else {
				System.out.println("at odd is" + s.toLowerCase().charAt(i));
			}
		}
		

	}

}
