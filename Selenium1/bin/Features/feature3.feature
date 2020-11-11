Feature: facebook sign up validation

  Scenario Outline: we have a page to test
    Given a facebook signup page to test
    When we are on the signup page
    Then we verify our first name text box if it is valid then enter "<FirstName>" in the text box
    And then we verify last name test box and enter "<LastName>" in the text box
    And we verify logo for the last step and close the page

    Examples: 
      | FirstName | LastName |
      | Mohammed  | Arafat   |
      | Michael   | Scott    |
      | Razin     | Anik     |
      | Adam      | Smith    |

      
      
      