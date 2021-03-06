package egifelse;

public class IfElseDemo {

	public static void main(String[] args) {
	
		int x=71;
		
		if(x>=70) {
			System.out.println("top score");
		}else if(x<70 && x>59) {
			System.out.println("first class");
		}else if(x<60 && x>49) {
			System.out.println("try again");
		}else {
			System.out.println("better luck next time");
		}
		
		
		
		if(x%2==0) {
			System.out.println("yes x is even");
		}else {
			System.out.println("x is odd");
		}

		String exp="plus";
		if(exp.equals("plus")) {   //use == operator for primitives and use .equals method for objects
			System.out.println(5+3);
		}else {
			System.out.println("nothing");
		}
	}

}
