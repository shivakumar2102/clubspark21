 Feature: User able to fetch the data in the database
 @Postclub
 Scenario: User able to retrive the data
 Given user is able to provide data in database
 When User able fetch the data in api is "http://localhost:8080/users"
 Then user can validates the statuscod 201

