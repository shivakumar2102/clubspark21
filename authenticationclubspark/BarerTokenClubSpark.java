package authenticationclubspark;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class BarerTokenClubSpark {
@Test
	public void barermain() {
		baseURI="https://api.github.com";
		
		JSONObject obj = new JSONObject();
		obj.put("name","clubspark21");
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		.then().log().all();
	}
}
