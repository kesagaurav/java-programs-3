package com.service;

import java.util.List;

import com.example.exception.BusinnessException;
import com.example.model.Player;

public interface PlayerServiceSearch {
public Player getPlayerById(int id)throws BusinnessException;
public List<Player> getPlayersByAge(int age)throws BusinnessException;
public List<Player> getPlayersByCity(String city)throws BusinnessException;
public List<Player> getPlayersByGender(String gender)throws BusinnessException;
public List<Player> getPlayersByTeamName(String teamName)throws BusinnessException;

}
