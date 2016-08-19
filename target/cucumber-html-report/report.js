$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Log In",
  "description": "",
  "id": "log-in",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12957893445,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login failure",
  "description": "",
  "id": "log-in;login-failure",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the vodafone landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click the My Vodafone link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the \u0027using MyVodafone\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click the Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see the \u0027login Handler\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I try to login with invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see the notice \"Your email address is not registered for My Vodafone\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefinition.i_am_on_the_vodafone_landing_page()"
});
formatter.result({
  "duration": 9294732861,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_the_My_Vodafone_link()"
});
formatter.result({
  "duration": 2229460575,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_should_see_the_using_MyVodafone_page()"
});
formatter.result({
  "duration": 4115313912,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_the_Login_button()"
});
formatter.result({
  "duration": 1442232320,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_should_see_the_login_Handler_page()"
});
formatter.result({
  "duration": 2360183570,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_try_to_login_with_invalid_credentials()"
});
formatter.result({
  "duration": 2893197479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your email address is not registered for My Vodafone",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.i_should_see_the_notice(String)"
});
formatter.result({
  "duration": 274998214,
  "status": "passed"
});
formatter.after({
  "duration": 1491782493,
  "status": "passed"
});
formatter.before({
  "duration": 9853887265,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login failure",
  "description": "",
  "id": "log-in;login-failure",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am on the vodafone login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I try to login with invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should see the notice \"Your email address is not registered for My Vodafone\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefinition.i_am_on_the_vodafone_login_page()"
});
formatter.result({
  "duration": 3993468232,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_try_to_login_with_invalid_credentials()"
});
formatter.result({
  "duration": 2627596849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your email address is not registered for My Vodafone",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.i_should_see_the_notice(String)"
});
formatter.result({
  "duration": 236216556,
  "status": "passed"
});
formatter.after({
  "duration": 694942706,
  "status": "passed"
});
});