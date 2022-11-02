package BasicCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	public void createProjectTest(){
	// step: create the prerequisites data necessary
		JSONObject obj=new JSONObject();
		obj.put("created by", "surbhi");
		obj.put("projectName", "SDET39");
		obj.put("status", "on going");
		obj.put("teamSize", 12);
		
		//step:send the request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		Response resp = request.post("http://localhost:8084/addProject");
		
	     //step3: validate the responce
        System.out.println(resp.getContentType());
        System.out.println(resp.getStatusCode());
        System.out.println(resp.getStatusLine());
        System.out.println(resp.asString());
        System.out.println(resp.prettyPrint());
        System.out.println(resp.prettyPeek());
	}

}
