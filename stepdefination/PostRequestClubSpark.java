package stepdefination;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequestClubSpark {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;

	@Given("user is able to provide the data")
	@Given("user is able to provide data in database")
	public void user_is_able_to_provide_data_in_database() {
		 JSONObject object = new JSONObject();
		 object.put("email", "pramodh@gmail.com");
		 object.put("name", "pramodh");
		 object.put("password", "pramodh3");
		 object.put("phone", "84988675483");
		 object.put("role", "deeloper");
			object.put("address", "bangalore");
			
			
			
			
			
			
			
		     req = RestAssured.given();
		     req.body(object);
		     req.contentType(ContentType.JSON);	
	     
	}

	@When("User able fetch the data in api is {string}")
	public void user_able_fetch_the_data_in_api_is(String url) {
		res = req.post(url);
	}

	@Then("user can validates the statuscod {int}")
	public void user_can_validates_the_statuscod(Integer int1) {
		   validate = res.then();
		   validate.assertThat().statusCode(int1).log().all();
	   
	}

}
