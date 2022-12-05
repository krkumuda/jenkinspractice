package RestAssuredWithoutBddApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest1 {
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
	reqSpec.contentType(ContentType.JSON);
	//actions
	Response response=reqSpec.post("http://rmgtestingserver:8084/addProject");
	//validation
	response.getContentType();
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.assertThat().statusCode(201);
	valResponse.log().all();
}
}