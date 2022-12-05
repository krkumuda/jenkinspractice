package framework;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import DifferentWaytocreatepost.UsingPojo;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utility.BaseClass;
import utility.EndPointLibrary;

public class CreateProjectDelete extends BaseClass{
	@Test
	public void createAndDelete() {
		
		UsingPojo up=new UsingPojo("kumuda", "emp68"+javaUtil.getRanDomNum(1000),"pass",12);
		Response resp=given()
				.body(up)
				.contentType(ContentType.JSON)
				.when().post(EndPointLibrary.createProject);
		String expdata=restLib.getJsonData(resp, "projectId");
		System.out.println(expdata);
		resp.then().log().all();
		when().delete(EndPointLibrary.deleteProject+expdata);
		
		String query="select * from project";
		String actualdata=dUtil.getDataFromDatabase(query,1, expdata);
		Assert.assertEquals(expdata,actualdata);
		System.out.println("TC pass");
		resp.then().log().all();
	}

}
