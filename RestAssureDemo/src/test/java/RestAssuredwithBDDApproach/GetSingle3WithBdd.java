package RestAssuredwithBDDApproach;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetSingle3WithBdd {
	@Test
	public void GetProjectWithBDD() {
		when()
		.get("http://rmgtestingserver:8084/projects/TY_4253")
		.then()
		.statusCode(207)
		.log().all();
}
	}
