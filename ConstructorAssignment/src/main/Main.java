package main;

import address.Address;
import employee.Employee;
import project.Project;

public class Main {

	public static void main(String[] args) {
		
		Project p=new Project(1,"todo","gaurav");
		System.out.println(p);
		Project p1=new Project(2,"bank aplicances","john");
		System.out.println(p1);
		Address a=new Address(1,"kareembad","warangal","telengana",90909);
		System.out.println(a);
		Address a1=new Address(2,"shantinagar","hyderabad","telengana",90919);
		System.out.println(a1);
		
		Employee e=new Employee(1,22,"gaurav","kesagaurav@gmail.com",p,a);
		System.out.println(e);
		Employee e1=new Employee(2,23,"baksar","baskar@gmail.com",p1,a1);
		System.out.println(e1);
		
	}

}
