package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetSingleProject {
	@Test
	public void GetProjectWithBDD() {
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_4253")
		.then()
		.statusCode(200)
		.log().all();
	}
}
