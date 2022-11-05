package CrudOperationTestNG;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutRequestMethod {
	@Test
	public void putMethod() {
		JSONObject object = new JSONObject();
		
		object.put("id", 45);
		object.put("address", "mulbagal");
		object.put("email", "ramsham39@gmail.com");
		object.put("name", "ramsham");
		object.put("password", "ramsham123");
		
		object.put("phone", "9845177718");
		object.put("role", "developeer");
		
		given()
		.contentType(ContentType.JSON)
		.body(object).log().all()
		
		.when()
		.put("http://localhost:8080/users")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
