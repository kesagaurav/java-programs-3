package com.team.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.dbutil.PostGresConnection;
import com.example.exception.BusinnessException;
import com.example.model.Team;
import com.team.service.dao.TeamDao;

public class TeamServiceImpl implements TeamDao {

	@Override
	public int addTeam(Team team) throws BusinnessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Team> getAllTeams() throws BusinnessException {
		List<Team> teamList=new ArrayList<>();
		try(Connection connection=PostGresConnection.getConnection()){
			String sql="select teamid,teamname,location from team";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team=new Team();
				team.setTeamid(resultSet.getInt("teamid"));
				team.setTeamname(resultSet.getString("teamname"));
				team.setTeamlocation(resultSet.getString("location"));
				teamList.add(team);
			}
			if(teamList.size()==0) {
				throw new BusinnessException("No teams registered so far...Please use Add Team option to add a team");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinnessException("Internal error");
		}
		return teamList;
	}

}
