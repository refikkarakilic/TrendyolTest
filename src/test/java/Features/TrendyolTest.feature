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