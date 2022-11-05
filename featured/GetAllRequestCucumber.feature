Feature: a user is able to fetch all the data from database
@Getall
  Scenario: user wants to retrive the data from database
    When user is able to retrive the id by using an api "http://localhost:8080/users/all"
    Then user validate the status code of the id  200