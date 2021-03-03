package card;

public class CardNumberVerification {

	public static void main(String[] args) {

		String s="MXYZ-9090";
		
		if(s.matches("M[A-Z]{3}-[0-9]{4}")) {
			System.out.println("validated");
		}else {
			System.out.println("\n invalid");
		}
		
	}

}
