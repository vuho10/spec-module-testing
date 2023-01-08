Feature: Manage Customer

  Scenario: Add Customer with data valid
  Given user is on manager page
  And verify manage page
  When user click on Add Customer button
  And user enter <firstname> and <lastname> and <postcode>
  And click Add on Customer button
  And click ok of alert box
  And verify data
  Then message is display
  
  Scenario: Add Customer with data invalid
  Given user is on manager page
  And verify manage page
  When user click on Add Customer button
  And user enter <lastname> and <postcode>
  And click Add on Customer button
  Then message is display
  
  Scenario: Open Account is successful
  Given user is on manager page
  And verify manage page
  When user click on Open Account button
  And select <account> and <currency>
  And click on process button
  And click ok of alert box
  Then message is display
  
  Scenario: Open Account is not successful
  Given user is on manager page
  And verify manage page
  When user click on Open Account button
  And select <account>
  And click on process button
  Then message is display
  
  Scenario: Search Account is successful
    Given user is on manager page
    And verify manage page
    When user click on Customer button
    And user search customer exist
    And verify search customer
    Then message is display

  Scenario: Searching for a account that does not exist
    Given user is on manager page
    And verify manage page
    When user click on Customer button
    And user search customer does not exist
    And verify search customer
    Then message is display


  Scenario Outline: Customer made deposit successfully
    Given I open the website <website>
    Then I check the correct 'Customer Account' website
    When I select Account Number
    Then I click on 'Deposit' button
    And I input amount as <amount>
    Then I click on 'Deposit' button to deposit
    And I check the confirm message as <confirmMesg>
    Examples:
      |website                                                                | amount | confirmMesg        |