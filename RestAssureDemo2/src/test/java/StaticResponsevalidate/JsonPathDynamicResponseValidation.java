package StaticResponsevalidate;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonPathDynamicResponseValidation {
	@Test
	public void dynamicValidate()
	{
		RequestSpecification reqspec = RestAssured.given();
		Response response = reqspec.get("http://rmgtestingserver:8084/projects");
		response.getContentType();
		JsonPath path = response.jsonPath();
		String value = path.getString("projectName");
		//System.out.println(value);
		Assert.assertTrue(value.contains("maniqs12"));
	
	}

}