package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static String DB_URL = "jdbc:mysql://localhost:3306/first_db";
    private static String DB_USER = "root";
    private static String DB_PASSWORD = "89788";
    
    private Database() {
    	
    }
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
    	Class.forName("com.mysql.cj.jdbc.Driver"); 
    	Connection conn= null;
    	 conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    	 return conn;
    }
    
}
