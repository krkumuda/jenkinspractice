package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Delete3WithBdd {
	@Test
	public void deleteProject() {

		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_959")
		.then()
		.statusCode(204)
		.assertThat().time(org.hamcrest.Matchers.lessThan(000L),TimeUnit.MILLISECONDS)
		
		.log().all();
	}
}
