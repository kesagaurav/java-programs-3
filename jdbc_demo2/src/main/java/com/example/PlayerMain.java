package com.example;

import java.util.List;

import com.example.dao.PlayerDAO;
import com.example.dao.impl.PlayerDAOImpl;
import com.example.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerDAO pl=new PlayerDAOImpl();
		//Player p=new Player(12,"raj1",29,"bombay","female");
		//Player p1=new Player(13,"gaurav2",22,"warangal","male");
		//Player p2=new Player(11);
	//	int c=pl.addPlayer(p1);
		//int d=pl.addPlayer(p1);
	
//		
//		if(c>0) {
//			System.out.println("Player registered with below details");
//			System.out.println(p1);
//		}else {
//			System.out.println("Failure in registration");
//		}
//		
//		
//		int id=2;
//		Player player=pl.getPlayerById(id);
//		if(player==null) {
//			System.out.println("No player found with id "+id);
//		}else {
//			System.out.println("Player found with id = "+id+" and the details are below :");
//			System.out.println(player);
//		}
		
		
//		List<Player> playerList = pl.getAllPrayers();
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now in DB");
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			
//			}
		
		
////		
//		String teamName="ghost riders";
//		List<Player> playerList =pl.getAllPlayersByTeamName(teamName);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now from the teamName "+teamName);
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+teamName);
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//		}
		
		

		
		
//		String teamLocation="warangal";
//		List<Player> playerList =pl.getAllPlayersByTeamLocation(teamLocation);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now from the teamLocation "+teamLocation);
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+teamLocation);
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//		}
		
		

		
		
//		int teamId=4;
//		List<Player> playerList =pl.getAllPlayersByTeamId(teamId);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now from the teamLocation "+teamId);
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+teamId);
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//		}
		
//		
//		String city="warangal1";
//		List<Player> playerList =pl.getAllPlayersByCity(city);
//		if (playerList.size() == 0) {
//			System.out.println("No players as of now from the teamLocation "+city);
//		} else {
//			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+city);
//			System.out.println("Printing their details");
//			for (Player p : playerList) {
//				System.out.println(p);
//			}
//		}
//			
		
		
		
		
		
		int id=12;
			int p2=pl.deletePlayer(id);
			if(p2>0) {
				System.out.println("\n deleted at " + id);
			}else {
				System.out.println("\n false");
			}
		
		}// this is the closing bracket of psvm		
			
			
		
		
		
} // this is the closing bracket of class
		
		


//		int id=3;
//		int p2=pl.deletePlayer(id);
//		if(p2>0) {
//			System.out.println("\n deleted at" + id);
//		}else {
//			System.out.println("\n false");
//		}
		
		
//		int id=2;
//		String newCity="bangalore";
//		int x=pl.updatePlayerCity(id, newCity);
//		if(x>0) {
//			System.out.println("\n updated");
//		}else {
//			System.out.println("\n updated failed");
//		}
		
		
		
		
		
		
		
	

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
