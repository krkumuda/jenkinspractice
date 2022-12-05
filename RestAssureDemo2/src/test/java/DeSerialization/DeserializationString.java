package DeSerialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmployeeDetailsStringArray;

public class DeserializationString {
	@Test
	public void deserialisationDetails() throws Throwable, Throwable, Throwable {
	//step1:- create the objcet for object mapper 
			ObjectMapper obj= new ObjectMapper();
			//step2:-read the value from object mapper
			EmployeeDetailsStringArray value = obj.readValue(new File("./empdetailsString.json"),EmployeeDetailsStringArray.class);
			//fetch the required value from the
			value.geteName();
			System.out.println(value.geteName());
}
}