package utility;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;


public class DatabaseUtility {
Driver driverRef;
Connection connection;
public void conectToDB() throws SQLException {
	driverRef=new Driver();
	DriverManager.registerDriver(driverRef);
	connection=DriverManager.getConnection(IConstantPath.dbURL,IConstantPath.dbUserName,IConstantPath.dbPassword);
	
}
public void closeDB() throws SQLException {
	connection.close();
}
public List<String> getDataFromDatabase(String query, String columnName) throws SQLException {
	Statement statement = connection.createStatement();
	ResultSet result = statement.executeQuery(query);
	List<String> list = new ArrayList();
	while (result.next()) {
	list.add(result.getString(columnName));
	}
	return list;
	}
public String readDataFromDBAndValidate(String query,int columnIndex,String expData) throws SQLException {
	boolean flag=false;
	ResultSet result=connection.createStatement().executeQuery(query);
	while(result.next()) {
		if(result.getString(columnIndex).equalsIgnoreCase(expData)) {
			flag=true;
			break;
		}
	}
	if(flag) {
		System.out.println("verified");
		
	return expData;
	}else
	{System.out.println("data not verified");
	return "";
	}
	
}
public String getDataFromDatabase(String query, int i, String expdata) {
	// TODO Auto-generated method stub
	return null;
}

}

