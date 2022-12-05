package DeSerialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmpIdWithIntArray;

public class DeserializationIntArray {
	@Test
	public void deserialisationEmpdetailsTest() throws Throwable, Throwable, Throwable {
		// step1:- create the objcet for object mapper
		ObjectMapper obj = new ObjectMapper();
		// step2:-read the value from object mapper
		EmpIdWithIntArray value = obj.readValue(new File("./empDataWithIntArray.json"), EmpIdWithIntArray.class);
		// fetch the required value from the
		value.geteName();
		System.out.println(value.geteName());

	}
}
