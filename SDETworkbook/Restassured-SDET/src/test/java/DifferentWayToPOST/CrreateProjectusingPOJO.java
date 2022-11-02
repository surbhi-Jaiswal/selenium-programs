package DifferentWayToPOST;

import org.testng.annotations.Test;

import POJOLibraries.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CrreateProjectusingPOJO {
	@Test
	public void CreateProjectPOJO() {
	    baseURI="http://localhost";
	    port=8084;
	    
	    //create prerequisites
	    ProjectLibrary plib= newProjectLibrary("surbhi","nuage",)
	}

}
