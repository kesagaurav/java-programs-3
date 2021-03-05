package eg1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("accessing Interface");
		Implementor i=new Implementor();
		i.method1();
		i.method2();
		i.method3();
		i.common();
		System.out.println("\n accessing an MyInterface2");
		MyInterface2 m2=new Implementor();
		m2.common();
		m2.feature1();
		m2.feature2();

	}

}
