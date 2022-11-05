package CrudOperationTestNG;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostMethodRequest {
@Test
	public void PostMethod() {
		JSONObject object = new JSONObject();
		
		object.put("address","Nishaq");
		object.put("email", "nisha344@gmail.com");
		object.put("name", "Nishaq");
		object.put("password","NIsha2w3");
		object.put("role", "keeperr");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		.post("http://localhost:8080/users")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}
}
