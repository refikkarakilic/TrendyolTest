@TrendyolTest
  Feature: Trendyol Check Test Cases

@AllEmpty
Scenario Outline: Empty Username & Empty Pasword
  Given User at home page
  When click login button
  Then Check "<errors>" message abouth username
  Examples:
  |error                                     |
  |Lütfen geçerli bir e-posta adresi giriniz.|

  @EmptyPassword
  Scenario Outline:
    Given User at home page
    When write "<username>" for username field
    When click login button
    Then Check "<errors>" message abouth password
    Examples:
    |username|error                     |
    |abcde   |Lütfen şifrenizi giriniz. |

    @EmptyUsername
    Scenario Outline: Empty Username
      Given User at home page
      When write "<password>" for password field
      When click login button
      Then Check "<errors>" message abouth username
      Examples:
        |password|errors                                      |
        |123456   |Lütfen geçerli bir e-posta adresi giriniz. |
