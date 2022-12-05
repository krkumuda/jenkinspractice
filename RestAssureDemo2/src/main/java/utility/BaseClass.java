package utility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseClass {
public WebDriverUtility webDriverutil=new WebDriverUtility();
public DatabaseUtility dUtil=new DatabaseUtility();
public JavaUtility javaUtil=new JavaUtility();
public RestAssuredLibrary restLib=new RestAssuredLibrary();
@BeforeSuite
public void bsConfig() throws SQLException {

	dUtil.conectToDB();
	baseURI="http://rmgtestingserver";
	port=8084;
}
@BeforeClass
public void bcConfig() {
	
}
@AfterSuite
public void asConfig() throws SQLException {
	dUtil.closeDB();
}
}
