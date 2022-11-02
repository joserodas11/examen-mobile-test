Feature: Exam
  @test
  Scenario: User login
    Given User is on login screen
    When User writes its "standard_user" and "secret_sauce" to log in
    Then User validates title PRODUCTS is displayed
    And User validates that one item exists