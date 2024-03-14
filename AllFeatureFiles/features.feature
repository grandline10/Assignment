Feature: Testing test cases on Tendable web application

  Scenario: Testing elements on the homepage and few sub pages
    Given User is on the tendable homepage
    And user verifies accessibility Home, Our Story, Our Solution, Why Tendable and request demo
    When user opens Our story page and user verifies the accessibility of request demo button
    And user opens our solution page and user verifies the accessibility of request demo button
    And user opens why tendable page and  user verifies the accessibility of request demo button
    And user clicks on the contact us page
    And then clicks on marketing option
    When the user fills up the form except the message section
    And clicks on submit
    Then It shows error message and if it does then take a screenshot otherwise do not
