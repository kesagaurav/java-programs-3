package eg1;

public abstract class EMS {

	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void calculateEmployee();
	public abstract void deleteEmployee();
	
	public void commonEmployee() {
		System.out.println("This implementation is common across any employee");
	}
	
}
