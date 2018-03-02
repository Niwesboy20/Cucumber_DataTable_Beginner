Feature: LoginTest

  Scenario: Login with incorrect username and password.
    Given I navigate to SSO login page
    When I enter the username and password
          | Username | Password |
          | Niwesboy20@gmail.com | 35000 |
    When I click login button
    Then I should see error message as error alert from page
    And I close web browser