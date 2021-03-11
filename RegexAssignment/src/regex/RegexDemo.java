package regex;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String ssn="040123456789";
		
		if(ssn.matches("\\[0-9]{10}")) {
			System.out.println(" the ssn is Valid");
		}else {
			System.out.println(" teh ssn is not Invalid");
		}
		
		String passportNumber="A0296457";
		if(passportNumber.matches("\\+[a-zA-Z][0-9]{10}")) {
			System.out.println("\n passport number is valid");
		}else {
			System.out.println("\n passport number is not valid");
		}
			
		
		String adharcardNumber="358153443708";
		if(adharcardNumber.matches("[0-9]")) {
			System.out.println("\n the adharcard number is valid");
		}else {
			System.out.println("\nthe adharcard number is not valid");
		}
		
		
			}
		
		
	}


	


