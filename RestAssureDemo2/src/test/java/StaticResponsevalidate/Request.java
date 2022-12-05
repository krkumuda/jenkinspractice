package StaticResponsevalidate;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.JavaUtility;

public class Request {	
	@Test
	public void CreateProjectByRequest()
	{
		//As we using POST http method-->creating the body
		//JavaUtility jv = new JavaUtility();
		//int ran = JavaUtility.getRanDomNum(1000));
		JSONObject obj=new JSONObject();
		obj.put("createdBy","kavana");
		obj.put("projectName","hms"+JavaUtility.getRanDomNum(200));
		obj.put("status","true");
		obj.put("teamSize", 100);

		//preconditions
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(obj);
		reqspec.contentType(ContentType.JSON);

		//actions
		Response response = reqspec.post("http://rmgtestingserver:8084/addProject");
		String value = response.jsonPath().get("projectId");
		System.out.println(value);
		reqspec.pathParam("pid", value);
		Response req = reqspec.get("http://rmgtestingserver:8084/projects/{pid}");
		req.getBody().prettyPrint();

	}
}


