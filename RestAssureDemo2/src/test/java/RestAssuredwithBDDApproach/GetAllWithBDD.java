package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class GetAllWithBDD {
	@Test
	public void UpdatewithBDD() {
		
		when()
		.get("http://rmgtestingserver:8084/projects")
		.then()
		.statusCode(200)
		.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.contentType(ContentType.JSON)
		.log().all();
	}
}
