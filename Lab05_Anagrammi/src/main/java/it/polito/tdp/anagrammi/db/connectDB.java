package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class connectDB {
	
	public static Connection getConnection() throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=quel0p0rc0" ;
		return DriverManager.getConnection(jdbcURL) ;
	}

}
