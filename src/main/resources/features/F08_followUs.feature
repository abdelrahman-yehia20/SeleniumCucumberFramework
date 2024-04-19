Feature: F08_followUs | user should be able to follow all social media links for the website

  Scenario: user opens facebook link
    When user click on facebook icon
    Then user should navigate to facebook page

  Scenario: user opens twitter link
    When user opens twitter link
    Then user should navigate to twitter page

  Scenario: user opens rss link
    When user opens rss link
    Then user should navigate to rss page

    Scenario: user opens youtube link
      When user opens youtube link
      Then user should navigate to youtube page