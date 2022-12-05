package Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmployeeDetailsWithObject;
import pojoclassforParsing.Spouse;

public class SerializationForObject {

	@Test
	public void employee() throws Throwable, JsonMappingException, IOException {
	Spouse s=new Spouse("kumuda",784,"g@gmail.com");
	int [] a= {37548,83934};
	String [] eMail= {"jmnh@gmail.com","hjfjjh@gmail.com"};
	EmployeeDetailsWithObject emp=new EmployeeDetailsWithObject("kumuda","emp123",a,eMail,s);
	ObjectMapper obj1= new ObjectMapper();
	obj1.writeValue(new File("./empdetailsObjectArray.json"), emp);		
	}
}
