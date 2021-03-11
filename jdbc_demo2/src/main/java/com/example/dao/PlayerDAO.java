package com.example.dao;

import java.util.List;

import com.example.model.Player;

public interface PlayerDAO {

	public int addPlayer(Player player);
	
	public int updatePlayerCity(int id,String newCity);

	public int deletePlayer(int id);
	
	public Player getPlayerById(int id);
	
	public List<Player> getAllPrayers();
	
	public List<Player> getAllPlayersByTeamName(String teamName);
	public List<Player> getAllPlayersByTeamLocation(String teamLocation);
	public List<Player> getAllPlayersByTeamId(int teamId);
	public List<Player> getAllPlayersByCity(String city);
	
}
