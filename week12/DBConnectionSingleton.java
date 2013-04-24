package week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * example of managing a database connection via
 * a Singleton
 * NOTE - this is NOT threadsafe!!! Don't use this
 * for a real application!

 *
 */
public class DBConnectionSingleton {
	private static DBConnectionSingleton instance = null;
	private static Connection conn;

	private DBConnectionSingleton() {
		String dbDriver = "drivername";
		String url = "url";
		String username = "joe";

		String password = "password";
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException cnfErr) {
			cnfErr.printStackTrace();
		} catch (SQLException err) {
			err.printStackTrace();
		}
	}

	public static DBConnectionSingleton getInstance() {
		if (instance == null)
			return new DBConnectionSingleton();
		else
			return instance;
	}

	public static Connection getConnection() {
		return conn;
	}
}