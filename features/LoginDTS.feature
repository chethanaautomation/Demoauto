Feature: User Login

Scenario: Sucssful Login
 Given Access to Application
    When user Enter credentials(user name:"1212121212", Password:"Dress@123")
    And user click on Login button
    Then user should be navigate to My account page
    And user should be see My profile