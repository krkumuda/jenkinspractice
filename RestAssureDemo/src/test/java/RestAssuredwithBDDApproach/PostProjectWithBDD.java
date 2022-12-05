package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.JavaUtility;


public class PostProjectWithBDD {
	@Test
	public void PostwithBDD() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","kavana"+JavaUtility.getRanDomNum(20));
		obj.put("projectName","hms"+JavaUtility.getRanDomNum(20));
		obj.put("status","true"+JavaUtility.getRanDomNum(30));
		obj.put("teamSize", 100);
		
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		
		.then()
		.statusCode(201)
		.log().all();
	}
	
}
