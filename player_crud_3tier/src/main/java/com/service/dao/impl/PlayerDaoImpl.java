package com.service.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.example.PostresConnection;
import com.example.dbutil.PostGresConnection;
import com.example.exception.BusinnessException;
import com.example.model.Player;
import com.service.dao.PlayerCrudDao;

public class PlayerDaoImpl implements PlayerCrudDao {

	@Override
	public int createPlayer(Player player) throws BusinnessException {
		int c=0;
		try(Connection connection=PostGresConnection.getConnection()){
			String sql = "insert into player4(id,name,age,city,gender,teamid) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getCity());
			preparedStatement.setString(5, player.getGender());
			preparedStatement.setInt(6, player.getTeam().getTeamid());
			c=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //only at development not at production/live
			throw new BusinnessException("Internal error occured... Please contact SYSSADMIN");
		}
		
		return c;
		//return 0;
	}

	@Override
	public int updatePlayer(int id, String city) throws BusinnessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePlayer(int id) throws BusinnessException {
		Player player=new Player();
		int d=0;
		try(Connection connection=PostGresConnection.getConnection()){
			String sql="delete from  player4 where id=?:";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(2,id);
			d=ps.executeUpdate();
		System.out.println("\n deleted the record" + d);
		}catch(Exception e) {
			e.printStackTrace();
			throw new BusinnessException("could not delte the id ... plz check again");
		}
		return d;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinnessException {
		List<Player> playerList=new ArrayList<>();
		try(Connection connection=PostGresConnection.getConnection()){
			String sql = "select id,name,age,gender,city from player4";
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
		//return null;
	}

}
