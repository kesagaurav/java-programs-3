package exception;

public class ExceptionLogic {

	public static boolean isValidPassportNumber(String name) throws BusinessException{
		if(!name.matches("\\[0-9]{10}")) {
			throw new BusinessException("enter passport" + name);
		}
		return true;
	}
	
}
