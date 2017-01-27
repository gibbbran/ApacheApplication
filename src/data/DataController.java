package data;

import java.sql.Connection;
import java.sql.SQLException;

public class DataController {

	private Connection myConnection;
	
	public DataController() {
		try {
			myConnection = (new dbConnection().createConnection());
		} catch (SQLException e) {
			System.out.println("Error creating connection");
			e.printStackTrace();
		}
	}
}
