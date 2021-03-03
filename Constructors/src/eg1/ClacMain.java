package eg1;

public class ClacMain {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		Calculator c1=new Calculator(2,3);
		System.out.println(c1.add());
		System.out.println(c1.multiply());

	}

}
