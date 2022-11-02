package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_serDes.EmployeeDetails;

public class Deserialization {
	@Test
	public void DeserializtionTest() throws Throwable, JsonMappingException, IOException {
		//create object of object mapper
		ObjectMapper obj= new ObjectMapper();
		
		//read the value from object Mapper class
		EmployeeDetails emp = obj.readValue(new File(".\\Emp.json"), EmployeeDetails.class);
		
		//access the value using refrence
	   emp.setName("Sdet");
	   emp.setPhone(455646);
	   System.out.println(emp.getPhone());
		System.out.println(emp.getName());
		
	}

}
