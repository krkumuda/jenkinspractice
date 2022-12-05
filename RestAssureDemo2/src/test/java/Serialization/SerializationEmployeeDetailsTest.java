package Serialization;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclassforParsing.EmployeeDetails;


public class SerializationEmployeeDetailsTest {
@Test

public void employeedetails() throws Throwable, JsonMappingException, IOException{
	//Step1:- create object of pojo class
		EmployeeDetails emp= new EmployeeDetails("Kumuda", "emp123", 789456,  "Banglore","kumuda@gmail.com");
		//Step2:- create objcet for object mapper
		ObjectMapper objm= new ObjectMapper();
		//Step 3 write the value to the json file
		objm.writeValue(new File("./EmployeeDetails.json"), emp);
	

}
}
