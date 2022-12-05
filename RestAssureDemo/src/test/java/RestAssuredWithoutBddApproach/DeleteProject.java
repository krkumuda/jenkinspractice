package RestAssuredWithoutBddApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteProject {
	@Test
	public void deleteProject() {
		RequestSpecification reqSpec = RestAssured.given();
		Response responce = reqSpec.delete("http://rmgtestingserver:8084/projects/TY_PROJ_916");
		responce.getContentType();
		ValidatableResponse valRes = responce.then();
		valRes.assertThat().contentType(ContentType.JSON);
		valRes.assertThat().statusCode(500);
		valRes.log().all();
		
			
	}
}