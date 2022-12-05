package DifferentWaytocreatepost;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utility.JavaUtility;


public class UsingHashmap {
@Test
public void Post_Hashmap() {
	HashMap<String, String>map=new HashMap<String, String>();
	map.put("ceatedBy", "Kumuda"+JavaUtility.getRanDomNum(20));
	map.put("projectName", "test yantraa");
	map.put("status", "true");
	map.put("teamSize", "13");
	
	given()
	.body(map)
	.contentType(ContentType.JSON)
	.when()
	.post("http://rmgtestingserver:8084/addProject")
	.then()
	.statusCode(201)
	.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
	.log().all();
}
	
}

