package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.exception.BusinnessException;
import com.example.model.Player;
import com.example.model.Team;
import com.service.PlayerCRUDService;
import com.service.impl.PlayerCRUDServiceImpl;
import com.team.service.dao.TeamDao;
import com.team.service.impl.TeamServiceImpl;

public class TreeTrierMain {

	public static void main(String[] args) {
		
		System.out.println();
		
		int ch=0;
		Scanner sc=new Scanner(System.in);
		PlayerCRUDService pcs=new PlayerCRUDServiceImpl();
		TeamDao td=new TeamServiceImpl();
		do {
			System.out.println("PLAYER MENU");
			System.out.println("1.Add Player");
			System.out.println("2.update player");
			System.out.println("3.delete player");
			System.out.println("4.list all players");
			System.out.println("5.search player by any of these id,name,age,gender,city");
			System.out.println("6.list all teams");
			System.out.println("7.add team");
			System.out.println("8.exit");
			System.out.println("plz enter an approripate search between (1-8)");
			try {
				ch=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e){
				System.out.println(e);
			}
			
			switch(ch) {
			case 1:
				System.out.println("Enter below Player Details to Create the Player");
				Player player = new Player();
				try {
					System.out.println("Enter player id:");
					player.setId(Integer.parseInt(sc.nextLine()));

				} catch (NumberFormatException e) {
					System.out.println("Player id should be number only");
					break;
				}
				try {
					System.out.println("Enter player age:");
					player.setAge(Integer.parseInt(sc.nextLine()));
				} catch (NumberFormatException e) {
					System.out.println("Player age should be number only");
					break;
				}
				System.out.println("Enter Player Name");
				player.setName(sc.nextLine());
				System.out.println("Enter Player City");
				player.setCity(sc.nextLine());
				System.out.println("Enter Player Gender(m/f/F/M)");
				player.setGender(sc.nextLine());
				System.out.println("Please select the teamNumber from the below list");
				try {
					List<Team> teamList = td.getAllTeams();
					for (int i = 0; i < teamList.size(); i++) {
						System.out.println((i + 1) + ")" + teamList.get(i).getTeamname());
					}
					System.out.println(teamList.size() + 1 + ")Not preffered for now");

					try {
						System.out.println("Please enter your team choice between 1 - " + (teamList.size() + 1));
						int choice = Integer.parseInt(sc.nextLine());

						if (choice > 0 && choice <= teamList.size() + 1) {
							if (choice == teamList.size() + 1) {
								player.setTeam(new Team());
							} else {
								player.setTeam(teamList.get(choice - 1));
							}
						} else {
							System.out.println("Invalid choice");
						}

					} catch (NumberFormatException e) {
						System.out.println("Player team choice should be number only");
						break;
					}
				} catch (BusinnessException e) {
					System.out.println(e.getMessage());
					break;
				}
				try {
					if (pcs.createPlayer(player) == 1) {
						System.out.println("Player Registered Successfully with below details");
						System.out.println(player);
					}
				} catch (BusinnessException e) {
					System.out.println(e.getMessage());
				}
			break;
			case 2:
				try {
					int id=2;
					String city="warangal";
					System.out.println(pcs.updatePlayer(id, city));
				
				}catch (BusinnessException e1) {
				e1.printStackTrace();
				}
				break;
			case 3:
				try {
					int id1=1;
					System.out.println(pcs.deletePlayer(id1));
					//System.out.println("deleted is" + id);
				} catch (BusinnessException e1) {
				
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("\n printing all the players");
					System.out.println("\n" + pcs.getAllPlayers());
				} catch (BusinnessException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("under construction");
				break;
			case 6:
				List<Team> teamList;
				try {
					teamList = td.getAllTeams();
					System.out.println("Printing all the teams");
					for (int i = 0; i < teamList.size(); i++) {
						System.out.println((i + 1) + ")" + teamList.get(i));
					}
				}catch (BusinnessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				System.out.println("under construction");
				break;
			case 8:
				System.out.println("thankyou for using the player app");
				break;
				
				default:
					System.out.println("\n invalid choice");
					break;
			}
			
				
			
		}while(ch!=8);
		
		
	}

}
