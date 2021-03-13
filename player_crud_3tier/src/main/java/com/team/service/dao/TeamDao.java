package com.team.service.dao;

import java.util.List;

import com.example.exception.BusinnessException;
import com.example.model.Team;

public interface TeamDao {

	public int addTeam(Team team)throws BusinnessException;
	public List<Team> getAllTeams()throws BusinnessException;
	
}
