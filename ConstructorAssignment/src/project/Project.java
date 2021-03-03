package project;

public class Project {

	private int projectid;
	private String projectname;
	private String clientname;
	public Project(int projectid, String projectname, String clientname) {
		super();
		this.projectid = projectid;
		this.projectname = projectname;
		this.clientname = clientname;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + ", clientname=" + clientname + "]";
	}
	
	
}
