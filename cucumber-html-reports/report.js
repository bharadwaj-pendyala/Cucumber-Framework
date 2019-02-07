$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Searching google should return the name of query",
  "description": "",
  "id": "searching-google-should-return-the-name-of-query",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Google search with scenario",
  "description": "",
  "id": "searching-google-should-return-the-name-of-query;google-search-with-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launches Google webapp",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user searches for a \"query\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "results retreived should contain the \"query\" used",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});