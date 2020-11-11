Feature: Cucumber plugin check

  Scenario: Once you are in eclipse
    Given you have a cucumber script ready
    When we execute step one, make sure it runs ok
    Then we move on to step three
    When we execute step three, make sure it runs ok
    And we execute step four, make sure that runs ok
    And we execute step five, make sure that runs ok
    Then our test has completed successfully
