package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteRequestClubSpark {

	Response response;
	ValidatableResponse validate;
	@When("user is able to delete the data by using an url is {string}")
	public void user_is_able_to_delete_the_data_by_using_an_url_is(String url) {
	       response = RestAssured.get(url);
	}

	@Then("user validate the status code of delete the id is {int}")
	public void user_validate_the_status_code_of_delete_the_id_is(Integer int1) {
	     validate = response.then();
	     validate.assertThat().statusCode(int1).log().all();
	}

}
