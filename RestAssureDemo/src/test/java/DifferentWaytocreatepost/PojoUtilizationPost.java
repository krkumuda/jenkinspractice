package DifferentWaytocreatepost;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PojoUtilizationPost {
@Test
public void pojoclass() {
UsingPojo upo=new UsingPojo("kumu", "hms","sucess", 40);
given()
.body(upo)
.contentType(ContentType.JSON)
.when()
.post("http://rmgtestingserver:8084/addProject")
.then()
.statusCode(201)
.assertThat().time(org.hamcrest.Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
.log().all();
}
}
