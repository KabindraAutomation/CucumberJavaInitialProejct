Feature: Application Login

  @PortalTest
  Scenario: Home page default Login
    Given User in NetBanking Landing page
    When User login into application with "Jon" and password "1234"
    Then HomePage is populated
    And Cards displayed are "true"

  @PortalTest
  Scenario: Home page default Login
    Given User in NetBanking Landing page
    When User login into application with "John" and password "SmokePuk"
    Then HomePage is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default Login
    Given User in NetBanking Landing page
    When User sign up with following detail
      | SanityJenny | abcd | John@test.com | Conway | 24055444334 |
    Then HomePage is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default Login
    Given User in NetBanking Landing page
    When User login into application with "John" and password "PukiMobile"
    Then HomePage is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default Login
    Given User in NetBanking Landing page
    When User login into application with "JohnzMobile" and password "PukiSmoke"
    Then HomePage is populated
    And Cards displayed are "true"

  @PortalTest
  Scenario Outline: Home page default Login
    Given User in NetBanking Landing page
    When User login in to application with <username> and <password>
    Then HomePage is populated
    And Cards displayed are "true"

    Examples: 
      | username | password        |
      | User1    | Password1234    |
      | User2    | Password12345   |
      | User3    | Password123456  |
      | User4    | Password1234567 |
