Feature: Jugoterapia run an end-to-end user flow
  Scenario: As a user I should be able to select a category, beverage and recipe
    When I launch the application
    Then I should be able to see the category list
      And I should be able to click in the category
      And I should be able to list beverages
      And I should be able to click in a beverage
      And I should be able to view a recipe
      And I should back to beverage section
      And I should back to category section
      And I should be able to close application
