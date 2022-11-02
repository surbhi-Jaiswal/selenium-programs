package DifferentWayToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectUsingHashMap {
	

	@Test
	public void createProject() {
		Random ran =new Random();
		int random = ran.nextInt();
		
		baseURI="http://localhost";
		port=8084;
		
		//create pre requisities
		HashMap hm=new HashMap();
		hm.put("created by", "surbhi");
		hm.put("projectName", "nuage"+ random);
		hm.put("status","created");
		hm.put("TeamSize",20);
		
		//send the request and validate the responce
		given()
		.body(hm)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		
		
		
		
		
		
		
		
	}

}
