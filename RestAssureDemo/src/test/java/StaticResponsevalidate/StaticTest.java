package StaticResponsevalidate;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticTest {
@Test
public void test() {
	String Expecteddata="TY_PROJ_1017";
	baseURI="http://rmgtestingserver";
	port=8084;
	Response response=when().get("/projects");
	String actualData=response.jsonPath().get("[1].projectId");
	Assert.assertEquals(actualData, Expecteddata);
	System.out.println("data verified");
	response.then().log().all();
}
}
