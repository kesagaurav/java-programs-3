package operator;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
	
		int x=6;
		if(x>1&&x%2==1) {
			System.out.println("\n yes it is greater than one");
		}else {
			System.out.println("\n no");
		}
		
		if(!(x>1)) {
			System.out.println("\n it is not geater than one");
		}else {
			System.out.println("\n no it is greater than 1");
		}

		
		x=0;
		boolean b=(x>4)?true:false;
		System.out.println(b);
		
		String exp="plus" + "mins";
		
		int x1=8;
		int y=9;
//		if(exp.equals("plus")) {
//			System.out.println(x1+y);
//		}else if(exp.equals("minus")) {
//			System.out.println(x1-y);
//		}
		
		if(exp.contains("plus")) {
			System.out.println(x1+y);
		}else if(exp.contains("minus")) {
			System.out.println(x1-y);
		}
		
			//ctrl+shift+f for formatting
	}

}
