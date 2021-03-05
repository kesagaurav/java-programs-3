package eg1;

public class Player extends Person{// is a relationship
	
	private int teamid;
	private String teamname;
	
	public Player() {
		super();
	}

	

	public Player(int id,String name,int teamid, String teamname) {
		super(id,name);
		this.teamid = teamid;
		this.teamname = teamname;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Override
	public String toString() {
		return "Player [teamid=" + teamid + ", teamname=" + teamname + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
