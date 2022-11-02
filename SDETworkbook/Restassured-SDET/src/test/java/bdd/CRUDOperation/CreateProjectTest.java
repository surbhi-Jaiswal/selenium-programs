package bdd.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectTest {
	@Test
	public void CreateProject() {
		baseURI="http://localhost";
		port=8084;
		
		Random ran=new Random();
		int random = ran.nextInt(500);
		
		//create pre requisities
		JSONObject obj= new JSONObject();
		obj.put("created by", "Anishka");
		obj.put("projectName", "SDET39-online"+ random);
		obj.put("status", "on going");
		obj.put("teamSize", 12);
		//send a request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		//validate the responce
		
	}

}
