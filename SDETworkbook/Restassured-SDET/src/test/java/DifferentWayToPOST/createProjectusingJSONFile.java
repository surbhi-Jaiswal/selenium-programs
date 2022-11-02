package DifferentWayToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class createProjectusingJSONFile {
	@Test
	public void createProject()
	{
		baseURI="http://localhost";
		port=8084;
	    //create the prerequisites
		File file =new File("./file.json");
		
		//send the request and validate the response
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
	}
	

}
