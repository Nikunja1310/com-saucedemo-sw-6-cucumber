$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a User I want to Login to SauceDemo Website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3367272000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should verify 6 products are displayed after login",
  "description": "",
  "id": "login-test;user-should-verify-6-products-are-displayed-after-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@sanity"
    },
    {
      "line": 13,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter User name  \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter Password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I should see number of products on the page as 6",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 69837100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 20
    }
  ],
  "location": "LoginSteps.iEnterUserName(String)"
});
formatter.result({
  "duration": 103657700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 49398200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 76639100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 31500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 47
    }
  ],
  "location": "LoginSteps.iShouldSeeNumberOfProductsOnThePageAs(int)"
});
formatter.result({
  "duration": 33088800,
  "status": "passed"
});
formatter.after({
  "duration": 642165900,
  "status": "passed"
});
});