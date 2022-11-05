package CrudOperationTestNG;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetRequestMethod {

	@Test
	
	public void GetRequestMethod() {
		
		baseURI ="http://localhost:8080";
		when()
		.get("http://localhost:8080/users/4")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
