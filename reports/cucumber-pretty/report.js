$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/project.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "Go to user Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to log in",
  "keyword": "When "
});
formatter.step({
  "name": "Enter \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Go to Social Nwtwork",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "babuBhai25",
        "babubhai@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "Go to user Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinationProject.go_to_user_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to log in",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinationProject.navigate_to_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"babuBhai25\" and \"babubhai@1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationProject.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to Social Nwtwork",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationProject.go_to_Social_Nwtwork()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "Go to user Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to Login",
  "keyword": "When "
});
formatter.step({
  "name": "Enter \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Go to My couses",
  "keyword": "Then "
});
formatter.step({
  "name": "Go to Demo Course",
  "keyword": "Then "
});
formatter.step({
  "name": "Select Chat Option and send the message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "babuBhai25",
        "babubhai@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "Go to user Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinationProject.go_to_user_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinationProject.navigate_to_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"babuBhai25\" and \"babubhai@1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinationProject.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to My couses",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationProject.go_to_My_couses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to Demo Course",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationProject.go_to_Demo_Course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Chat Option and send the message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationProject.select_Chat_Option_and_send_the_message()"
});
formatter.result({
  "status": "passed"
});
});