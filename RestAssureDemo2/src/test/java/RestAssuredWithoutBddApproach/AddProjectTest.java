package RestAssuredWithoutBddApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
@Test
public void AddProjectTest() {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","kumuda");
	jobj.put("projectName","hms");
	jobj.put("status","created");
	jobj.put("teamSize", 100);
	
	//precondtion
	RequestSpecification resSpec = RestAssured.given();
	resSpec.contentType(ContentType.JSON);
	//actions
	Response response = resSpec.post("http://rmgtestingserver:8084/addProject");
	//validations
	response.getContentType();
	ValidatableResponse valResponse=response.then();
	valResponse.assertThat().contentType(ContentType.JSON);
	valResponse.assertThat().statusCode(201);
	valResponse.log().all();
}

}
