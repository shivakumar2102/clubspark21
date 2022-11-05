package CrudOperationTestNG;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequestMethod {
	@Test
	public void delete() {
		baseURI = "http://localhost:8080";
		when()
		.delete("http://localhost:8080/users/5")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
		
	}

}
