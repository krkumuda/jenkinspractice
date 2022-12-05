package CrudOperationWithBdd;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutWithBDD {
	
	@Test
	public void UpdatewithBDD() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","priya");
		jobj.put("projectName","testyantra");
		jobj.put("status","okkk");
		jobj.put("teamSize", 8);
		
		//step1:pre condition
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//step2:action or excecution
		.when()
		.put("http://rmgtestingserver:8084/projects/TY_PROJ_4252")
		
		//step3:validation
		.then()
		.statusCode(200)
		.log().all();
	}
}
