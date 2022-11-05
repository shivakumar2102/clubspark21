Feature: user is able to delete the data from the database
@deleteid
  Scenario: user wants to delete the data from database
    When user is able to delete the data by using an url is "http://localhost:8080/users/41"
    Then user validate the status code of delete the id is 200