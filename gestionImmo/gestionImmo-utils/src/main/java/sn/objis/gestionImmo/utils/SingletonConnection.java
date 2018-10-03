package sn.objis.gestionImmo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

	private static Connection connection;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/locationImmo";
			String login = "root";
			String password = "";

			connection = DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			System.out.println("Problème d'accès à la base de données locationImmo");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Probleme de chargment du pilote MySql");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
