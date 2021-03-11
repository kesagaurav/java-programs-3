package com.example.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		
		
		return 0;
	}

	@Override
	public int deletePlayer(Player player) {
		// TODO Auto-generated method stub
int c=0;
		
		try(Connection con=PostresConnection.getConnection()){
			String sql="delete from player4 where id=2";
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

		return 0;
	}

}
