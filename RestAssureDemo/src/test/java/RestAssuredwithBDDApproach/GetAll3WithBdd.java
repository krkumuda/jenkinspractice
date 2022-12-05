package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAll3WithBdd {
	@Test
	public void UpdatewithBDD() {
		
		when()
		.get("http://rmgtestingserver:8084/")
		.then()
		.statusCode(201)
		.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.contentType(ContentType.TEXT)
		.log().all();
}
}