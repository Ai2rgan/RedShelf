Feature: Validating order details


  Background:The user searches book
      Given the user logged in  in account page
    @4
    Scenario:results of book
      Given the user enters name of book to search
     When page opens user validates the message "Showing results for Clean Code"
      Then he validates  that all books have same button View Details  on that page

@5
  Scenario: Header of results
   When the user enters only numbers in books search field "1345678"
    Then he validates  message "Oh No! Looks like we don't have the eBook you're searching for."
@6
    Scenario: Symbols in search field
      When the user enters only symbols in books search field "!@#$%^&*()_+{}:"
      Then user will see  message "Try modifying your search, or checking out offers from other retailers below."









