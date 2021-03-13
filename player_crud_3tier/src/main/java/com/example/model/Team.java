package com.example.model;

public class Team {



private int teamid;
private String teamname;
private String teamlocation;


public Team() {
	super();
}


public Team(int teamid, String teamname, String teamlocation) {
	super();
	this.teamid = teamid;
	this.teamname = teamname;
	this.teamlocation = teamlocation;
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


public String getTeamlocation() {
	return teamlocation;
}


public void setTeamlocation(String teamlocation) {
	this.teamlocation = teamlocation;
}


@Override
public String toString() {
	return "Team [teamid=" + teamid + ", teamname=" + teamname + ", teamlocation=" + teamlocation + "]";
}







}
