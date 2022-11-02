package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_serDes.EmployeeDetails;
import Practice_POJO_serDes.EmployeeDetailsArray;

public class DeserializationArray {
	@Test
	public void DeserializtionTest() throws Throwable, JsonMappingException, IOException {
		//create object of object mapper
		ObjectMapper obj= new ObjectMapper();
		
		//read the value from object Mapper class
		EmployeeDetailsArray emp = obj.readValue(new File("./Array.json"), EmployeeDetailsArray.class);
		
		//access the value using refrence
		emp.setId(3);
		emp.setAddress("mysore");
		emp.setEmailId(null);
		emp.setName(null);
		emp.setPhone(null);
	    System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getAddress() + " " + emp.getEmailId() + " " + emp.getPhone());
	}

}
