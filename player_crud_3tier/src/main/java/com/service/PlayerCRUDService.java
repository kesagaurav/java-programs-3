package com.service;

import java.util.List;

import com.example.exception.BusinnessException;
import com.example.model.Player;

public interface PlayerCRUDService {

	public int createPlayer(Player player) throws BusinnessException;
	public int updatePlayer(int id,String city) throws BusinnessException;
	public int deletePlayer(int id) throws BusinnessException;
	public List<Player> getAllPlayers() throws BusinnessException;
	
	
}
