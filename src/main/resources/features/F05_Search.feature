Feature: F05|Search:  user could able to search for any product

  Scenario Outline: user search for product name
    When user enter search result as "<productName>"
    Then The result should be displayed "<productName>"

    Examples:
    |productName|
    |  ele   |
    |    and    |
   |  Android   |


    Scenario Outline: user search for SKU
      When  user enter search result as a"<SKU>"
      Then The result should be displayed a"<SKU>"

      Examples:
      |  SKU  |
      | AP_MBP_13  |
      | SF_PRO_11  |