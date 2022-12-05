package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParameter {
@Test
public void query() {
	
		baseURI="https://reqres.in";
		given()
		.queryParam("pid","2").contentType(ContentType.JSON)
		.when()
		.get("/api/users")
		.then()
		.statusCode(200)
		.log().all();
	}

}
