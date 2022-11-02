package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_serDes.EmployeeDetails;

public class Serialization {
	@Test
	public void serializationTest() throws Throwable, JsonMappingException, IOException {
		
		// CREATE OBJECT OF POJO CLASS
		EmployeeDetails emp=new EmployeeDetails("surbhi",123445,"sur123","sur@gmail.com", true);
		
		//Create object of OBJECTCLASS FROM JACKSONMAPPER
		ObjectMapper obj= new ObjectMapper();
		
		//call write value method and provide the file path
		obj.writeValue(new File("./Emp.json"),emp);
	}

}
