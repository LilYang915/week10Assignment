package Project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Project.Exception.DbException;

public class DbConnection {

	private static final String SCHEMA = "week9assignment";
	private static final String USER = "week9assignment";
	private static final String PASSWORD = "week9assignment";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;
	
	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER , PASSWORD);
		System.out.println("Connecting with url=" + url);
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Sucessful");
			return conn;
	} catch (SQLException e) {
		throw new DbException(e); 
	}
	
}	
}
	
	

