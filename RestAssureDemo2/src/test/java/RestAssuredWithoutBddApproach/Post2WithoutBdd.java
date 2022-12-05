package RestAssuredWithoutBddApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Post2WithoutBdd {
	@Test
	public void PostProjectTest() {
		//as  we are using post http method -->creating the body
		JSONObject json=new JSONObject();
		json.put("createdBy", "Harish");
		json.put("projectName", "test Yantra");
		json.put("status", "created");
		json.put("teamSize", 500);
		//mandatory-->preconditions, Actions and validation
		//preconditions
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(json);
		reqSpec.contentType(ContentType.TEXT);
		//actions
		Response response=reqSpec.post("http://rmgtestingserver:8084/addProject");
		//validation
		response.getContentType();
		ValidatableResponse valResponse=response.then();
		valResponse.assertThat().contentType(ContentType.XML);
		valResponse.assertThat().statusCode(200);
		valResponse.log().all();
	}
}
