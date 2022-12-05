package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.JavaUtility;

public class Post1 {
	@Test
	public void PostwithBDD() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","roopa"+JavaUtility.getRanDomNum(30));
		obj.put("projectName","hms1"+JavaUtility.getRanDomNum(16));
		obj.put("status","true"+JavaUtility.getRanDomNum(40));
		obj.put("teamSize", 110);
		
		
		given()
		.body(obj)
		.contentType(ContentType.TEXT)
		
		
		.when()
		.post("http://rmgtestingserver:8085/")
		
		
		.then()
		.statusCode(200)
		.log().all();
}
}