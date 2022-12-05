package DifferentWaytocreatepost;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class UsingJsonFile {
@Test
public void jsonFile() {
	
	File file=new File("./src/test/resources/Post.json");
	
			given()
			.body(file)
			.contentType(ContentType.JSON)
			
			.when()
			.post("http://rmgtestingserver:8084/addProject")
			
			.then()
			.statusCode(201)
			.log().all();
}
}
