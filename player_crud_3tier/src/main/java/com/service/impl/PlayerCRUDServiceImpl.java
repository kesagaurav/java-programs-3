package com.service.impl;

import java.util.List;

import com.example.exception.BusinnessException;
import com.example.model.Player;
import com.service.PlayerCRUDService;
import com.service.dao.PlayerCrudDao;
import com.service.dao.impl.PlayerDaoImpl;

public class PlayerCRUDServiceImpl implements PlayerCRUDService {

	private PlayerCrudDao pcd=new PlayerDaoImpl();
	
	@Override
	public int createPlayer(Player player) throws BusinnessException {
		// TODO Auto-generated method stub
		if(!PlayerValidations.isValidId(player.getId())) {
			throw new BusinnessException("Entered played id is" + player.getId() + "in valid");
		}
		
		if(!PlayerValidations.isValidPlayerName(player.getName())) {
			throw new BusinnessException("Entered played id is" + player.getName() + "in valid");
		}
		
		if(!PlayerValidations.isValidPlayerage(player.getAge())) {
			throw new BusinnessException("Entered played id is" + player.getAge() + "in valid");
		}
		
		if(!PlayerValidations.isValidPlayergener(player.getGender())) {
			throw new BusinnessException("Entered played id is" + player.getGender() + "in valid");
		}
		
		
		if(!PlayerValidations.isValidPlayerCity(player.getCity())) {
			throw new BusinnessException("Entered played id is" + player.getCity() + "in valid");
		}
		
		
		// do the handshake with dao
		return pcd.createPlayer(player);
		
		//return 0;
	}
	
	

	
	
	
	@Override
	public int updatePlayer(int id, String city) throws BusinnessException {
	
return pcd.updatePlayer(id, city);
	}

	@Override
	public int deletePlayer(int id) throws BusinnessException {
		// TODO Auto-generated method stub
		return pcd.deletePlayer(id);
	}

	@Override
	public List<Player> getAllPlayers() throws BusinnessException {

		return pcd.getAllPlayers();
	}

}
