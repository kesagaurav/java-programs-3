package object_casting_demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1=new Player(1,"gaurav1");
		System.out.println("p1  ->"  + p1);

		Player p2=new Player(2,"gaurav1");
		System.out.println("p2  ->"  + p2);
		
		if(p1.equals(p2)) {
			System.out.println("both are same");
		}else {
			System.out.println("\n not same");
		}
		
	}
//parent is large and child is small
	//implicit-compiler-any small to large
	//explict-programmer-any large to small
	
}
