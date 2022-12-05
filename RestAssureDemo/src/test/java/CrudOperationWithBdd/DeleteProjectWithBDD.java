package CrudOperationWithBdd;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class DeleteProjectWithBDD {
@Test
public void deleteProject() {

	when()
	.delete("http://rmgtestingserver:8084/projects/TY_PROJ_946")
	.then()
	.statusCode(204)
	.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
	
	.log().all();
}
}