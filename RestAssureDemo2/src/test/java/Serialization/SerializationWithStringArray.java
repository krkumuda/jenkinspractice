package Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmployeeDetailsStringArray;

public class SerializationWithStringArray {
	@Test
	public void serializationOfEmpDataWithString() throws Throwable, JsonMappingException, IOException {

		String[] email = { "h6453d@gamil.com", "spna537@gmail.com" };
		EmployeeDetailsStringArray emp = new EmployeeDetailsStringArray("kumuda", "emp123", 7788, "mysore", email);
		ObjectMapper obj1 = new ObjectMapper();
		obj1.writeValue(new File("empdetailsString.json"), emp);
	}

}
