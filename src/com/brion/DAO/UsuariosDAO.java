package com.brion.DAO;
import java.sql.*;

public class UsuariosDAO {
	
	public String result;
	
	public UsuariosDAO(){
		DBConnection con=new DBConnection();
		try{
			Statement query = con.getConnection().createStatement();
			ResultSet rs=query.executeQuery("SELECT * FROM Usuarios");
			
			result="{ \"Usuarios\" : [";
			
			boolean flag=false;
			
			while(rs.next()){
				if(flag){
					result+=",{ \"Nombre\" : \""+rs.getString(1)+"\", \"Edad\" : \""+rs.getString(2)+"\"}\n";
				}else{
					result+="{ \"Nombre\" : \""+rs.getString(1)+"\", \"Edad\" : \""+rs.getString(2)+"\"}\n";
					flag=true;
				}
			}
			
			result+="]}";
			
			System.out.println(result);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
