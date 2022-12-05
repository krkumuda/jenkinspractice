package RestAssuredwithBDDApproach;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class GetSingleProjectWithBDD {
	@Test
	public void GetProjectWithBDD() {
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_4252")
		.then()
		.statusCode(200)
		.log().all();
	}
}
