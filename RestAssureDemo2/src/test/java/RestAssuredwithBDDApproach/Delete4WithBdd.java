package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Delete4WithBdd {
	@Test
	public void deleteProject() {

		when()
		.delete("http://rmgtestingserver:8084/projects")
		.then()
		.statusCode(204)
		.assertThat().time(org.hamcrest.Matchers.lessThan(4000L),TimeUnit.MILLISECONDS)
		
		.log().all();
	}
}
