#Author: your.email@your.domain.com
#Keywords Summary :
#""" (Doc Strings)

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User is on Greencart landing page
    And user searched with short name shir and extracted actual name of the product
    Then User is on product page and product title is displayed

  @tag1
  Scenario Outline: Title of your scenario
    Given User is on Greencart landing page
    And user searched with short name shir and extracted actual name of the product
    Then User is on product page and product title is displayed

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
