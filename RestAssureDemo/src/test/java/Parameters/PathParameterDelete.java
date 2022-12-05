package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathParameterDelete {
@Test
	public void delete() {
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.pathParam("pid","TY_PROJ_927").contentType(ContentType.JSON)
		.when()
		.delete("/projects/{pid}")
		.then()
		.statusCode(204)
		.log().all();
		
	}
}

