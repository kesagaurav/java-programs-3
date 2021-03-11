package exception;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionLogic logic=new ExceptionLogic();
		DriverLogic dl=new DriverLogic();
		
		try {
			if (logic.isValidPassportNumber("A20901828")) {
				System.out.println("Valid number");
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		
		try {
			if(dl.isValidDriverLicense("123456789ma")) 
				System.out.println("\n valid number");
		
				}
			catch(Exception e) {
			System.out.println(e.getMessage());
	
	}
		

	}

}
