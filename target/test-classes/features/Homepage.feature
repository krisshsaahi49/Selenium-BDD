Feature: Krisshsaahi portfolio homepage test

  @regression @smoke @sanity
  Scenario Outline: To verify the homepage functionality of portfolio and send an email
    Given user naviagtes to krisshportfolio
    When user clicks on contact us
    And user send email with "<email>", "<subject>" and "<message>"
    Then user close the browser

    Examples: 
      | email             | subject         | message              |
      | andy@gmail.com    | Andy Subject    | Message from Andy    |
      | ruby@gmail.com    | Ruby Subject    | Message from Ruby    |
      | taylor@gmail.com  | Taylor Subject  | Message from Taylor  |
      | jessica@gmail.com | Jessica Subject | Message from Jessica |

  @sanity @perf
  Scenario Outline: To verify the homepage functionality of portfolio and send an email
    Given user naviagtes to krisshportfolio
    When user clicks on contact us
    And user send email with "<email>", "<subject>" and "<message>"
    Then user close the browser

    Examples: 
      | email          | subject      | message           |
      | ruby@gmail.com | Ruby Subject | Message from Ruby |

  @regression
  Scenario Outline: To verify the homepage functionality of portfolio and send an email
    Given user naviagtes to krisshportfolio
    When user clicks on contact us
    And user send email with "<email>", "<subject>" and "<message>"
    Then user close the browser

    Examples: 
      | email          | subject      | message           |
      | andy@gmail.com | Andy Subject | Message from Andy |
