package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter name");
		String name=sc.nextLine();
		System.out.println("\n enter your age:" );
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("\n enter your salarly:");
		double salarly=Double.parseDouble(sc.nextLine());
		System.out.println("\n enter contact");
		long contact=Long.parseLong(sc.nextLine());
		System.out.println("\n enter gender");
		char gender=sc.nextLine().charAt(0);
		
		System.out.println("hello " + name);
		System.out.println("Age " + age);
		System.out.println("Salarly " + salarly);
		System.out.println("Contact " + contact);
		System.out.println("Gender " + gender);
		
		
	}

}
