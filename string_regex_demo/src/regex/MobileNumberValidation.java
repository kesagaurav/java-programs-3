package regex;

public class MobileNumberValidation {

	public static void main(String[] args) {
		
		String s="1-9234567890";
		
		if(s.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}

}


//Assignment Regex - 1)Write validation for passport number, SSN number, DL and any other ID if you have.