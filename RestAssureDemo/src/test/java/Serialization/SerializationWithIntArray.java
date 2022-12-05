package Serialization;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmpIdWithIntArray;


public class SerializationWithIntArray {
@Test
public void serializationOfEmpdatawitharrayTest() throws Throwable, JsonMappingException, IOException  {
	//create the object for pojo class
	int[] phone= {123456,198745};
	EmpIdWithIntArray emp=new EmpIdWithIntArray("kavitha", "emp123", phone, 4567, "mysore");
	ObjectMapper obj1= new ObjectMapper();
	obj1.writeValue(new File("./empIntArray.json"), emp);
}
}
