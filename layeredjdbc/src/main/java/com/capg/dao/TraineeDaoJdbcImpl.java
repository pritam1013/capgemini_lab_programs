package com.capg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capg.model.Trainee;

public class TraineeDaoJdbcImpl implements TraineeJdbc {
	Connection con;
	PreparedStatement ps;
	Statement statement;
	
	public TraineeDaoJdbcImpl() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
														"system","harsh");
		
	}
	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		// TODO Auto-generated method stub
		ps=con.prepareStatement("insert into trainee values(?,?,?)");
		ps.setInt(1, trainee.getId());
		ps.setString(2, trainee.getName());
		ps.setString(3, trainee.getEmail());
		int rowsUpdated=ps.executeUpdate();
		if(rowsUpdated>0) {
			return trainee;
		}
		else
		return null;
	}

	@Override
	public Trainee findTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		Trainee trainee=new Trainee();
		ps=con.prepareStatement("select * from trainee where id=?");  
        ps.setInt(1,id); 
        ResultSet rs = ps.executeQuery();
        if(rs!=null)
        {
        while(rs.next())
        {
        	trainee.setId(rs.getInt("id"));
        	trainee.setName(rs.getString("name"));
        	trainee.setEmail(rs.getString("email"));
        }
		return trainee;
		
        }
        else
        	return null;
     }

	@Override
	public boolean removeTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		ps=con.prepareStatement("delete from trainee where id=?");
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		int update=ps.executeUpdate();
		if(update==0)
		{
			return true;
		}
		return false;
		
	}
	
}
