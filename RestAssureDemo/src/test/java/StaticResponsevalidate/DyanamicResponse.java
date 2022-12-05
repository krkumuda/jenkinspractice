package StaticResponsevalidate;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DyanamicResponse {
@Test
public void dynamicresponse() {
	String expData="TY_PROJ_5920";
	baseURI="http://rmgtestingserver";
	port=8084;
	
	Response res=when().get("/projects");
	boolean flag=false;
	java.util.List<String> pIds=res.jsonPath().get("projectId");
	for(String projects:pIds) {
		if(projects.equalsIgnoreCase(expData)) {
			flag=true;
			
		}
	}
	Assert.assertTrue(flag);
	System.out.println("test case passed");
	res.then().assertThat().log().all();
}
}
