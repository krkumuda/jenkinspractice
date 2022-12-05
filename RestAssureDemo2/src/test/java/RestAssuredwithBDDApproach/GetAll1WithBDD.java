package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAll1WithBDD {
	@Test
	public void UpdatewithBDD() {
		
		when()
		.get("http://rmgtestingserver:8085/projects")
		.then()
		.statusCode(200)
		.assertThat().time(org.hamcrest.Matchers.lessThan(100L),TimeUnit.MILLISECONDS)
		.contentType(ContentType.TEXT)
		.log().all();
}
}
