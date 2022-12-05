package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Put2WithBdd {
	@Test
	public void UpdatewithBDD() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","kavana");
		obj.put("projectName","hms");
		obj.put("status","ok");
		obj.put("teamSize", 400);
		
		
		given()
		.body(obj)
		.contentType(ContentType.TEXT)
		
		
		.when()
		.put("http://rmgtestingserver:8084/projects/TY_PROJ_4251")
		
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
