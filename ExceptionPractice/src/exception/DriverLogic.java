package exception;

public class DriverLogic {

	public static boolean isValidDriverLicense(String name){
		if(!name.matches("\\[a-z-0-9-A-Z]")) {
			throw new DriverLicence("enter driving licence" + name);
		}
		return true;
	}
	
}


