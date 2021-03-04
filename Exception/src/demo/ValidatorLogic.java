package demo;

public class ValidatorLogic {

	public boolean isValidAge(int age) throws InvalidAgeException {
		if(age<=0) {
			throw new InvalidAgeException("cannot be -ve or zero");
		}else if(age<=18||age>35) {
			throw new InvalidAgeException("can be allowed between 18 and 35");

		}
		return true;
	}
		public  boolean isValidMobileNumber(String contact) throws InvalidContactException{
			if(!contact.matches("\\+1-[0-9]{10}")) {
				throw new InvalidContactException("entered conact "+ contact);
			}
			return true;
			
		}
			
	}

