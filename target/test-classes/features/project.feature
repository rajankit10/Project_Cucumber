Feature: Login feature

  @test1
  Scenario Outline: 
    Given Go to user Login page
    When Navigate to log in
    And Enter "<Username>" and "<Password>"
    Then Go to Social Nwtwork

    Examples: 
      | Username   | Password      |
      | babuBhai25 | babubhai@1234 |

  @test2
  Scenario Outline: 
    Given Go to user Login Page
    When Navigate to Login
    And Enter "<Username>" and "<Password>"
    Then Go to My couses
    Then Go to Demo Course
    Then Select Chat Option and send the message

    Examples: 
      | Username   | Password      |
      | babuBhai25 | babubhai@1234 |
