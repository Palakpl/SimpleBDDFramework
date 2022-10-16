Feature: DemoNopcommerce Register


  Background:
    Given User able to open browser
    And Enter Url

#
#  Scenario: Nopcommerce Valid Login Test
#    Then User click on login Link
#    And User on login page and  verify login page title
#    When User enter USERNAME and PASSWORD and click on login button
#      |abcd5@gmail.com|Test123|
#    Then User is on Home page
#    Then User close the browser

    Scenario: Nopcommerce Valid Register Test
      Then User click on register Link
      And User select gender
      Then User enter FirstName and LastName
      Then User enter BirthDay,BirthMonth and BirthYear
      Then User enter Email
      Then User enter Password and ConfirmPassword
      And click on Register button
      Then User close the browser
