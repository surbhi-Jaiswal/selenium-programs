package SerializationDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Practice_POJO_serDes.EmployeeDetailsArray;

public class serializationArray{
		
		@Test
		public void arraySerializationTest() throws Throwable, Throwable, Throwable
		{
			int[] arr = {98456,78688};
			String[] name= {"surbhi","anishka,krish,tarun"};
			String[] Email= {"surywanshi.surbhi09@gmail.com","tarun.o7@gmail.com","surbhi@234"};

			EmployeeDetailsArray emp = new EmployeeDetailsArray(9,name,arr, Email,"PUNE");
			
			ObjectMapper obj = new ObjectMapper();
			
			obj.writeValue(new File("./Array.json"), emp);
		}

	}


