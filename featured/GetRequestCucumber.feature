Feature: user is able to fetch all the data from database
@getid
  Scenario: user wants to retrive the data from database
    When user is able to retrive the id by using an api is "http://localhost:8080/users/37"
    Then user validate the status code of the id is 200