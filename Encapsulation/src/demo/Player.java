package demo;

public class Player {
	// data members and methods should be tightly coulped in this the data members are id and name
	private int id;
	private String name;
	
	
	public Player() {
		super();
	}


	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
