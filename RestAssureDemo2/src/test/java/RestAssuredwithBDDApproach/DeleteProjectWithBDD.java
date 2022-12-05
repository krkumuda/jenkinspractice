package RestAssuredwithBDDApproach;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class DeleteProjectWithBDD {
@Test
public void deleteProject() {

	when()
	.delete("http://rmgtestingserver:8084/projects/TY_PROJ_956")
	.then()
	.statusCode(204)
	.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
	
	.log().all();
}
}
