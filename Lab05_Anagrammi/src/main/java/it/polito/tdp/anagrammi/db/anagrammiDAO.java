package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.anagrammi.db.connectDB;

public class anagrammiDAO {
	
	public boolean ac(String parola){
		
		String sql = "select nome from parola where nome = ?";
		
		boolean found = false;
				
				try {
					Connection conn = connectDB.getConnection() ;
					
					PreparedStatement st = conn.prepareStatement(sql) ;
					st.setString(1, parola);
					
					ResultSet res = st.executeQuery() ;
					
					if(res.next()) {
						found = true;			
					}
					st.close();
								
					conn.close();
					
					return found ;
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		return found;
	}
	
	public boolean prefisso(String parziale) {
		
		String sql = "select nome from parola where nome like ?";
		
		boolean found = false;
		
		try {
			Connection conn = connectDB.getConnection() ;
			
			PreparedStatement st = conn.prepareStatement(sql) ;
			st.setString(1, parziale);
			
			ResultSet res = st.executeQuery() ;
			
			if(res.next()) {
				found = true;			
			}
			st.close();
						
			conn.close();
			
			return found ;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return found;
		
	}

}
