package RestAssuredWithoutBddApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetAll2WithoutBdd {
	@Test
	public void addAllPro() {
		
		RequestSpecification reqSpec = RestAssured.given();
		 
		 Response responce = reqSpec.get("http://rmgtestingserver:8084/projects");
		 
		ValidatableResponse valRes = responce.then();
		 
		valRes.assertThat().contentType(ContentType.JSON);
		
		valRes.assertThat().statusCode(400);
		
		valRes.log().all();
		 
	}
}
