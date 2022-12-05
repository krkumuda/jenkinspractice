package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Delete1WithBdd {
	@Test
	public void deleteProject() {

		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_959")
		.then()
		.statusCode(206)
		.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		
		.log().all();
	}
}
