package Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class FormParameter {
	@Test
	public void post() {
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.formParam("createdBy","kumuda")
		.formParam("projectName", "myntra")
		.formParam("status", "success")
		.formParam("teamSize","23")
		.pathParam("pid","TY_PROJ_947").contentType(ContentType.JSON)
		.when()
		.post("/projects/{pid}")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		

	}
}
