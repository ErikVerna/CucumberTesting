$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Application feature",
  "description": "",
  "id": "login-application-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login Scenario",
  "description": "",
  "id": "login-application-feature;user-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Application Page Title is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User navigate to user Profile page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_Home_Page()"
});
formatter.result({
  "duration": 3205200700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.applicationPageTitleIsFacebook()"
});
formatter.result({
  "duration": 22311800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 505734700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 111596200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_navigate_to_user_Profile_page()"
});
formatter.result({
  "duration": 3232773400,
  "status": "passed"
});
});