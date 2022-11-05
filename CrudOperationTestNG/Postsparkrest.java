package CrudOperationTestNG;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Postsparkrest {
@Test
	public void mainspark() {
	JSONObject obj = new JSONObject();
	obj.put("address","Alyyampr");
	obj.put("email", "tejavan95@gmail.com");
	obj.put("name", "anouku");
	obj.put("password","Paonok13");
	obj.put("phone", "2345776632");
	obj.put("role", "Busineyssman");
	
	 given()
	 .contentType(ContentType.JSON)
	 .body(obj)
	 
	 .when()
	 .post("http://localhost:8080/users")
	 .then()
	 .assertThat().statusCode(201).log().all();
	
		
		 

	}

}
