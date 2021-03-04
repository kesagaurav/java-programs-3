package demo;

public class demo1 {

	public static void main(String[] args) {

		int x=10;
		int y=2;
		int z=0;
		
		try {
			z=x/y;
			System.out.println("the res is " + z);
		}catch(Exception e) {
			System.out.println("error " + e);
		}
		
	}

}
