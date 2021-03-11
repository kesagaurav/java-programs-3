package com.example;

import com.example.dao.PlayerDAO;
import com.example.dao.impl.PlayerDAOImpl;
import com.example.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerDAO pl=new PlayerDAOImpl();
		Player p=new Player(12,"raj1",29,"bombay","female");
		//Player p2=new Player(11);
		int c=pl.addPlayer(p);
		int d=pl.deletePlayer(p);
		
		if(c>0) {
			System.out.println("Player registered with below details");
			System.out.println(p);
		}else {
			System.out.println("Failure in registration");
		}
		
		
		
	}

}
