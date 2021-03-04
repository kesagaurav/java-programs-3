package eg1;

public class Players {

	private int id;
	private String name;
	public Players(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
