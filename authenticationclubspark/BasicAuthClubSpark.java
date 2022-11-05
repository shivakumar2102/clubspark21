package authenticationclubspark;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthClubSpark {
	
	
	@Test
	public void BasicMain() {
		
		baseURI="https://api.github.com";
		
		given().auth().basic("shivakumar2102","Shiva@8970" )
		.when().get("/user/repos").then().log().all();
	}

}
