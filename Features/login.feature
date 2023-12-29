Feature: Feature to test loing functionality

  Scenario: Verify login is succelful with valid credentials
    Given User is lunch chrome broswer
    When user is open URL "https://demo.nopcommerce.com/login?returnUrl=%2F"
    And user enters Email as "praveenreddy09@gmail.com" and password as "1234567"
    And click on login
    Then title should be "nopCommerce demo store"
    Then user click on logout
    Then after logout title should be "nopCommerce demo store"
    And close broswer
    
    
    Scenario Outline: verify home page on dropdown
    Given User is lunch chrome broswer
    When user is open URL "https://demo.nopcommerce.com/login?returnUrl=%2F"
    And user enters Email as "<username>" and password as "<password>"
    And click on login
     Then title should be "nopCommerce demo store"
    Then user click on logout
    Then after logout title should be "nopCommerce demo store"
    And close broswer
    
    
    Examples:
    | username | password  |
    | praveenreddy09@gmail.com | 1234567 |
    | praveenreddy09@gmail.com  | 1234567 |
