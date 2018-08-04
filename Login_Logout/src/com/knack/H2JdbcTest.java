package com.knack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class H2JdbcTest {
	public static void main(String[] args) throws Exception {

		Properties properties;
		FileInputStream fileInputStream;
		fileInputStream = new FileInputStream("PropertyFile.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		String D_Name = properties.getProperty("Drivername");
		String D_URL  = properties.getProperty("URL");
		String UName  = properties.getProperty("USER");
		String UPass  = properties.getProperty("PASS");
			
		Connection connection = DriverManager.getConnection(D_URL, UName, UPass);
			 
		Statement statement = connection.createStatement();
			
		ResultSet reuslt = statement.executeQuery("select * from public.test");
		System.out.println(reuslt + "  records inserted ");

		
		
		
		
		
		
		
	}

}
