package framework;

import org.testng.Assert;
import org.testng.annotations.Test;

import DifferentWaytocreatepost.UsingPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import utility.BaseClass;
import utility.EndPointLibrary;

public class CreatepProjectVerifyInDataBasePost extends BaseClass {
	@Test
	public void createProject() throws SQLException {
		UsingPojo up=new UsingPojo("kumuda", "emp68"+javaUtil.getRanDomNum(1000),"pass",12);
		Response resp=given()
				.body(up)
				.contentType(ContentType.JSON)
				.when().post(EndPointLibrary.createProject);
		String expdata=restLib.getJsonData(resp, "projectId");
		System.out.println(expdata);
		String query="select * from project";
		String actualdata=dUtil.readDataFromDBAndValidate(query,1, expdata);
		Assert.assertEquals(expdata,actualdata);
		System.out.println("TC pass");
		resp.then().log().all();
		}

}
