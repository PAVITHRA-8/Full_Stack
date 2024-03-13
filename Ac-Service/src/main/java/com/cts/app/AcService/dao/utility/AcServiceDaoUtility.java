
package com.cts.app.AcService.dao.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class AcServiceDaoUtility  {
 
 
	private static String url;
	private static String userName;
	private static String password;
 
	public static String getUrl() {
		return url;
	}
 
	public static void setUrl(String url) {
		AcServiceDaoUtility.url = url;
	}
 
	public static String getUserName() {
		return userName;
	}
 
	public static void setUserName(String userName) {
		AcServiceDaoUtility.userName = userName;
	}
 
	public static String getPassword() {
		return password;
	}
 
	public static void setPassword(String password) {
		AcServiceDaoUtility.password = password;
	}
 
	public static Connection getConnection() {
 
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			return connection;
		} catch (SQLException e) {
			System.out.println("FAIL  " + e);
		}
		return null;
 
	}
}