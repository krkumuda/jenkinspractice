package CrudOperationWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutUpdateProject {
	@Test
	public void updatePro() {

		JSONObject jobj = new JSONObject();
		jobj.put("projectId", "TY_PROJ_916");
		jobj.put("projectName", "sdet117");
		jobj.put("teamSize", 467);
		jobj.put("createdBy", "Harishiuh");
		jobj.put("status", "testj");
		//preconditions

		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(jobj);
		reqSpec.contentType(ContentType.JSON);
		Response response = reqSpec.put("http://rmgtestingserver:8084/projects/TY_PROJ_916");
		System.out.println(response.getBody());
		ValidatableResponse validate = response.then().assertThat();
		validate.contentType(ContentType.JSON);
		validate.statusCode(200);
		validate.statusLine("HTTP/1.1 200 ");
		validate.log().all();
		

	}
}