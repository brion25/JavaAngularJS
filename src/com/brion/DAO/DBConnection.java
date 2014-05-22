package com.brion.DAO;

import java.sql.*;

public class DBConnection {

	private Connection connection = null;
	
	public DBConnection(){
		try{
			//obtenemos el driver de para mysql
	        Class.forName("com.mysql.jdbc.Driver");
	        //obtenemos la conexi—n
	        connection = DriverManager.getConnection("jdbc:mysql://localhost/BLOG","root","simpson22");
	        
	        if(connection != null){
	        	System.out.println("Connection Ok!");
	        }
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public Connection getConnection(){
		return connection;
	}
	
	public void closeConnection(){
		connection=null;
	}
}
