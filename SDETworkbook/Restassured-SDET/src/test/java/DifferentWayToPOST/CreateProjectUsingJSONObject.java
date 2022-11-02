package DifferentWayToPOST;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONObject {
	
	@Test
    public void createProject() {
		
		Random ran= new Random();
		int random = ran.nextInt(500);
		
      baseURI="http://localhost";
		port = 8084;
	    //create pre requsities
				
		JSONObject obj=new JSONObject();
		obj.put("created by", "surbhi");
		obj.put("projectName", "nuage"+ random);
		obj.put("status", "created");
		obj.put("teamSize", 20);
		
	    //send request and validate the responce
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		
		.then()
       .assertThat()
       .statusCode(201)
       .log().all();
		
		
	

}
}