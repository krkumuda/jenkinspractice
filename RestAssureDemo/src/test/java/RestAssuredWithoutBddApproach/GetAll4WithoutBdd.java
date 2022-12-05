package RestAssuredWithoutBddApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetAll4WithoutBdd {
	@Test
	public void addAllPro() {
		
		RequestSpecification reqSpec = RestAssured.given();
		 
		 Response responce = reqSpec.get("http://rmgtestingserver:8085/");
		 
		ValidatableResponse valRes = responce.then();
		 
		valRes.assertThat().contentType(ContentType.TEXT);
		
		valRes.assertThat().statusCode(200);
		
		valRes.log().all();
		 
	}
}
