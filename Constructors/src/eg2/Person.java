package eg2;

public class Person {
private int id;
private String name;
private String city;
private int age;
private Address personAddress;// has A relationship
public Person(int id, String name) {
	this.id = id;
	this.name = name;
}

public Person(int id, String name,String city,int age,Address personAddress) {
	this(id,name);
	this.city=city;
	this.age=age;
	this.personAddress=personAddress;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", personAddress="
			+ personAddress + "]";
}





}
