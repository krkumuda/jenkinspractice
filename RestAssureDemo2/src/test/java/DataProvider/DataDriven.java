package DataProvider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DifferentWaytocreatepost.UsingPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import utility.JavaUtility;

public class DataDriven {
@Test(dataProvider="getData")
public void dataTest(String createdBy,String projectName,String status,int teamSize ) {
	//JavaUtility javaUtil=new JavaUtility();
	UsingPojo pojo=new UsingPojo(createdBy,projectName+JavaUtility.getRanDomNum(100),status,teamSize);
	given().body(pojo).contentType(ContentType.JSON)
	.when().post("http://rmgtestingserver:8084/addProject")
	.then().assertThat().statusCode(201).log().all();
}
@DataProvider(name="getData")
public Object[][] data(){
	Object[][] data=new Object[4][4];
	data[0][0]="kumuda";
	data[0][1]="hospital";
	data[0][2]="ok";
	data[0][3]=12;
	

	data[1][0]="kavana";
	data[1][1]="management";
	data[1][2]="okk";
	data[1][3]=10;
	
	data[2][0]="roopa";
	data[2][1]="system";
	data[2][2]="done";
	data[2][3]=16;
	
	data[3][0]="priya";
	data[3][1]="hms";
	data[3][2]="true";
	data[3][3]=15;
	return data;
}


	
}
