package demo;

public class ValidatorMain {

	public static void main(String[] args) {

	
		ValidatorLogic logic=new ValidatorLogic();
		
		try {
			if(logic.isValidAge(22)) {
				System.out.println("\n age is validated");
			}
		}catch(Exception e) {
			System.out.println("error " + e.getMessage());
		}
		
		try {
			if (logic.isValidMobileNumber("+1-12345678909")) {
				System.out.println("Valid number");
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		Car c=new Car();
		c.rule1();
		Car c1=new Car();
		c1.rule2();
		System.out.println(c);
		//System.out.println(c1);
		
		
	}

}
