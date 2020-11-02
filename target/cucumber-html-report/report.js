$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com.cucumber.features.redshelf/Search.feature");
formatter.feature({
  "name": "Validating order details",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "The user searches book",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user logged in  in account page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SearchStepDefinitions.theUserLoggedInInAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "results of book",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@4"
    }
  ]
});
formatter.step({
  "name": "the user enters name of book to search",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SearchStepDefinitions.theUserEntersNameOfBookToSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page opens user validates the message \"Showing results for Clean Code\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SearchStepDefinitions.pageOpensUserValidatesTheMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he validates  that all books have same button View Details  on that page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SearchStepDefinitions.heValidatesThatAllBooksHaveSameButtonViewDetailsOnThatPage()"
});
formatter.result({
  "status": "passed"
});
});