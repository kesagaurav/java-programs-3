package employee;

import address.Address;
import project.Project;

public class Employee {
	private int id;
private int age;
private String name;
private String email;
private Project project;
private Address address;
public Employee(int id, int age, String name, String email, Project project, Address address) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.email = email;
	this.project = project;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + ", project=" + project
			+ ", address=" + address + "]";
}


	
	
}
