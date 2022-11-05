package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllRequestClubSpark {
	Response response;
	ValidatableResponse validate;

	@When("user is able to retrive the id by using an api {string}")
	public void user_is_able_to_retrive_the_id_by_using_an_api(String url) {
		 response = RestAssured.get(url);
	}

	@Then("user validate the status code of the id  {int}")
	public void user_validate_the_status_code_of_the_id(Integer int1) {
		 validate = response.then();
		  validate.assertThat().statusCode(int1).log().all();
	}
	  
	
}
