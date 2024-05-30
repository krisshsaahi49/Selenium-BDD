Feature: Krisshsaahi portfolio homepage test

  Background: user navigates and scroll down to contact us
    Given user naviagtes to krisshportfolio
    When user clicks on contact us

  @sainty
  Scenario Outline: To verify the homepage functionality of portfolio and send an email
    And user send email with "<email>", "<subject>" and "<message>"
    Then user close the browser

    Examples: 
      | email             | subject         | message              |
      | taylor@gmail.com  | Taylor Subject  | Message from Taylor  |
      | jessica@gmail.com | Jessica Subject | Message from Jessica |

  @regression @smoke
  Scenario Outline: To verify the homepage functionality of portfolio and send an email
    And user send email with "<email>", "<subject>" and "<message>"
    Then user close the browser

    Examples: 
      | email          | subject      | message           |
      | ruby@gmail.com | Ruby Subject | Message from Ruby |

  @smoke @sanity @perf
  Scenario Outline: To verify the homepage functionality of portfolio and send an email
    And user send email with "<email>", "<subject>" and "<message>"
    Then user close the browser

    Examples: 
      | email          | subject      | message           |
      | andy@gmail.com | Andy Subject | Message from Andy |
