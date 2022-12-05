package DeSerialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmployeeDetailsStringArray;
import pojoclassforParsing.EmployeeDetailsWithObject;

public class DesearilizationObjectArray {
	@Test
	public void deserialisationDetails() throws Throwable, Throwable, Throwable {
		// step1:- create the objcet for object mapper
		ObjectMapper obj = new ObjectMapper();
		// step2:-read the value from object mapper
		EmployeeDetailsWithObject value = obj.readValue(new File("./empdetailsObjectArray.json"),
				EmployeeDetailsWithObject.class);
		// fetch the required value from the
		System.out.println(value.geteId());
	}
}