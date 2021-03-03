package eg1;

public class Calculator {

	private int a;
	private int b;
	
	
	public Calculator() {
		System.out.println("\nhello");
	}
	
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int add() {
		return a+b;
	}
	public int multiply() {
		return a*b;
	}

}
