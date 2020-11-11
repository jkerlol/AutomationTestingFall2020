Feature: yahoo signup validation

  Scenario Outline: we are on the signup page, with our elements loaded
    Given we have a sign up page to validate
    When we are on the webpage
    Then we should see the correct URL
    And we should the correct title
    And the logo should load!
    Then if the page is valid, close the page

