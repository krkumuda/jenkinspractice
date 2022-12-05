package DifferentWaytocreatepost;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.JavaUtility;


public class UsingJsonObject {
	@Test
	public void PostwithBDD() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","priya"+JavaUtility.getRanDomNum(30));
		jobj.put("projectName","testyantra"+JavaUtility.getRanDomNum(30));
		jobj.put("status","okkk"+JavaUtility.getRanDomNum(30));
		jobj.put("teamSize", 200);
		
		//step1:pre condition
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//step2:action or excecution
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		//step3:validation
		.then()
		.statusCode(201)
		.log().all();
}
}
