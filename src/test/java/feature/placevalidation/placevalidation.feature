Feature: Verify addplace feature

  @Addplace
  Scenario Outline: verify if a place gets added when addPlaceAPI is called
    Given ADDPlace paylod with "<name>" "<address>" "<Phone>"
    When "ADDPlace" payload is called using "post" method
    Then statuscode should be 200
    And "scope" is "APP"
    And "status" is "OK"
And verify if the address generated when "GETPlace" APi is called matches "<address>"
    Examples:

      | name   | address              | Phone      |
      | House1 | 81, Bnagar, cyber 09 | 8888888888 |

    @Deleteplace
    Scenario: verify if DeletePlace API works
      Given DeletePlace payload
      When "DeletePlace" payload is called using "post" method
      Then statuscode should be 200
      And "status" is "OK"