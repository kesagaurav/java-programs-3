package eg2;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person(1,"gaurav");
		System.out.println(p1);
		//Person p2=new Person(2,"gaurav","warangal",22);
		//System.out.println(p2);
		
		Address a=new Address(1,"waragal",2000);
		Person p=new Person(2,"gaurav","warangal",22,a);
		System.out.println(p);
	}

}
