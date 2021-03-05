package eg1;

public class Implementor implements Interface,MyInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("x" + Interface.x);
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("x" + Interface.x);

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("x" + Interface.x);

	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("x" + Interface.x);

	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("\n this is common for both Interface and Myinterface2");
		
	}

	@Override
	public void feature1() {
		// TODO Auto-generated method stub
		
		System.out.println("\n featre1");
		
	}

	@Override
	public void feature2() {
		// TODO Auto-generated method stub
		
		
		System.out.println("\n featute 2");
		
	}

}
