package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
//		Student student= new Student(535,"suresh","babu","ECE");
//		System.out.println(student);
		Connection conn = Database.getConnection();
		if(conn !=null) {
			System.out.println("Database connection successful");
		}
	}

}
