package bdd.CRUDOperation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjectTest {
	@Test
	public void GetAllProject() {
		
		baseURI="http://localhost";
		port=8084;
		
		//create pre requsities
		
		//send the request
				when()
				.get("/projects")
				.then()
				.assertThat().statusCode(200)
				.log().all();
				
		
		//validate th responce
		
	}

}
