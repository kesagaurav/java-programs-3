package com.example.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.PostresConnection;
import com.example.dao.PlayerDAO;
import com.example.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public int addPlayer(Player player) {
		// TODO Auto-generated method stub
		
		int c=0;
		
		try(Connection con=PostresConnection.getConnection()){
			String sql="insert into player4(id,name,age,gender,city) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, player.getId());
			ps.setString(2, player.getName());
			ps.setInt(3, player.getAge());
			ps.setString(4, player.getGender());
			ps.setString(5, player.getCity());
			
			//ps.setInt(1, player.getId());
			c=ps.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		return c;
	}

	@Override
	public int updatePlayerCity(int id, String newCity) {
		
int c=0;
		
		try(Connection con=PostresConnection.getConnection()){
			String sql="update player4 set name=? where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,newCity);
			ps.setInt(1, id);
			
			//ps.setInt(1, player.getId());
			c=ps.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
		
		return c;
	}

	@Override
	public int deletePlayer(int id) {
	
		// TODO Auto-generated method stub
		int d=0;
		try(Connection con=PostresConnection.getConnection()){
			String sql="delete from player4 where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
		
		
			d=ps.executeUpdate();
			//System.out.println("\n recoeded is" + d);
			
			
//			
//			
//			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return d;
		
//		

		
		//return;
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		Player p=null;
		try(Connection con=PostresConnection.getConnection()){
			String sql="select id,name,age,gender,city from player4 where id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				p=new Player();
				p.setId(id);
				p.setAge(rs.getInt("age"));
				p.setCity(rs.getString("city"));
				p.setGender(rs.getString("gender"));
				p.setName(rs.getString("name"));
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return p;
	}

	@Override
	public List<Player> getAllPrayers() {
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=PostresConnection.getConnection()){
			String sql = "select id,name,age,gender,city from playerschema.player4";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setName(resultSet.getString("name"));
				playerList.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByTeamName(String teamName) {
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=PostresConnection.getConnection()){
			String sql = "select id,name,age,gender,city from player4 p join  team t on p.teamid=t.teamid where t.teamname=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, teamName);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
			
				
				playerList.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByTeamLocation(String teamLocation) {
		// TODO Auto-generated method stub
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=PostresConnection.getConnection()){
			String sql = "select id,name,age,gender,city from player4 p join  team t on p.teamid=t.teamid where t.location=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, teamLocation);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
			
				
				playerList.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByTeamId(int teamId) {
		// TODO Auto-generated method stub
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=PostresConnection.getConnection()){
			String sql = "select id,name,age,gender,city from player4 p join  team t on p.teamid=t.teamid where t.teamid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, teamId);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
			
				
				playerList.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByCity(String city) {
		// TODO Auto-generated method stub
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=PostresConnection.getConnection()){
			String sql = "select id,name,age,gender,city from player4 p join  team t on p.teamid=t.teamid where p.city=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, city);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
			
				
				playerList.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return playerList;
		//return null;
	}
	
}

		



