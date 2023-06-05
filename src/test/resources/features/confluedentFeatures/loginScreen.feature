@loginScreen
Feature: Make login in the mobile application as a user.

  Background: the user opens the application.
    Given the user enter to application 'Confluedent'

  @loginUnsuccesfullWithWrongCredentials @login @confluedentApp
  Scenario Outline: login unsuccesfull with wrong credentials.
    When the user logins with mail '<mail>' and password '<pass>'
    And the user click to login button
    Then a message displayed with the text '@LOGIN_MESSAGE_WRONG_CREDENTIALS'
    Examples:
      | mail           | pass   |
      | 1234@gmail.com | 123456 |

  @loginUnsuccesfullWithEmptyCredentials @login @confluedentApp
  Scenario Outline: login unsuccesfull with empty credentials.
    When the user logins with mail '<mail>' and password '<pass>'
    And the user click to login button
    Then a message displayed with the text '@LOGIN_MESSAGE_EMPTY_CREDENTIALS'

    Examples:
      | mail | pass |
      |      |      |

  @RecoveryPassWithEmptyEmail @recoveryPass @confluedentApp
  Scenario Outline: recovery pass with empty credentials.
    When the user logins with mail '<mail>' and password '<pass>'
    And the user click to recovery pass button
    Then a message displayed with the text '@LOGIN_MESSAGE_EMPTY_CREDENTIALS'

    Examples:
      | mail | pass |
      |      |      |

  @SignUpSuccesfull @SignUp @confluedentApp
  Scenario: the user sign up to application.
    When the user click to sign up button
    And the user fills in the fields
    And the user click to save button
   # Then the user logged