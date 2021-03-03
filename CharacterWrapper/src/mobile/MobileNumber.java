package mobile;

public class MobileNumber {

	public static void main(String[] args) {

		String s="1 -234567890";
		
		if(s.matches("\\+1-[0-9]{10}")) {
			System.out.println("valid");
		}else {
			System.out.println("\n invalid");
		}
		
	}

}
