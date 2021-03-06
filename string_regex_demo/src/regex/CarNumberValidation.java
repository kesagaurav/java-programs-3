package regex;

public class CarNumberValidation {

	public static void main(String[] args) {
		/*
		 * 3uppercase letters followed by - and 4 digits
		 */

		String s="MXYZ-9090";
		
		if(s.matches("M[A-Z]{3}-[0-9]{4}")) {
			System.out.println("Validated");
		}else {
			System.out.println("Invalid");
		}
	}

}
