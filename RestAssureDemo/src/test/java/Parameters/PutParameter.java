package Parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutParameter {
	@Test
	public void put() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","kavana");
		obj.put("projectName","zomato");
		obj.put("status","done");
		obj.put("teamSize", 34);
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.pathParam("pid","TY_PROJ_5164")
		.when()
		.get("/projects/{pid}")
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
