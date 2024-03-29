package com.example.model;

public class Player {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String city;
	private Team team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public Player(int id, String name, int age, String gender, String city,Team team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.team=team;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
	
	
	
	
	

	public Team getTeam() {
		return team;
	}



	public void setTeam(Team team) {
		this.team = team;
	}



	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city
				+ ", team=" + team + "]";
	}
	
	
	
	
}
