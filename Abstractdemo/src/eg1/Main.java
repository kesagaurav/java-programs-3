package eg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n accessing EMS using revature employee");
		EMS ems=new RevatureEMS();
		ems.addEmployee();
		ems.calculateEmployee();
		ems.deleteEmployee();
		ems.updateEmployee();
		
		
		System.out.println("\n accessing EMS using rAbc employee");
		EMS ems1=new AbcEMS();
		ems1.addEmployee();
		ems1.calculateEmployee();
		ems1.deleteEmployee();
		ems1.updateEmployee();
		
		System.out.println(ems1);
		
	}

}
