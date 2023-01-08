Feature: Manage CustomerLogin

  Scenario: verify that user Login successfully with valid data
    Given user press on customer login button
    And verify that this is user management page
    When user selects option name
    And user chooses their name
    And user press on login button
    When user click on deposit button
    And user input numbers on amount text box
    And user press on deposit to save amount
    Then notification is displayed

  Scenario Outline: verify that user can not deposit successful
    Given user press on customer login button
    And verify that this is user management page
    When user selects option name
    And user chooses their name
    And user press on login button
    When user click on deposit button
    And user can not input <numbers> on amount text box
    And user press on deposit to save amount
    Then notification is displayed

    Examples:
      | numbers    |
      | -1000      |
      | hahahahaha |
      | e          |

  Scenario: verify that user can Withdrawl successful when inputting valid data
    Given user press on customer login button
    And verify that this is user management page
    When user selects option name
    And user chooses their name
    And user press on login button
    When user click on withdrawl button
    And user input numbers on Withdrawl text box
    And press on Withdrawl to save amount
    Then notification is displayed

  Scenario Outline: verify that user can not Withdrawl successful when inputting invalid data
    Given user press on customer login button
    And verify that this is user management page
    When user selects option name
    And user chooses their name
    And user press on login button
    When user click on withdrawl button
    And user does not input <numbers> on Withdrawl text box
    And press on Withdrawl to save amount
    Then notification is displayed

    Examples:
      | numbers |
      | 2000    |
      |         |
      | -1000   |
      | ẸABA    |

  Scenario: uer can transactions successful
    Given user press on customer login button
    And verify that this is user management page
    When user selects option name
    And user chooses their name
    And user press on login button
    When user click on transactions button
    And user click next button
    And user click top button
    Then user click reset button
    And user click back button
    Then notification is displayed


