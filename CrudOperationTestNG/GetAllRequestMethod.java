package CrudOperationTestNG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetAllRequestMethod {
	@Test
	public void getAllMethod() {
	  baseURI = "http://localhost:8080";
	  when()
	  .get("/users/all")
	  
	  .then()
	  .assertThat().statusCode(200)
	  .log().all();
		
	}

}
