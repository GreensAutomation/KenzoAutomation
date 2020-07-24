$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Kezso.feature");
formatter.feature({
  "line": 1,
  "name": "Testing logical functionality of placing the order of a product and returing of the product",
  "description": "",
  "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "user checking the login function using valid username and valid password",
  "description": "",
  "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product;user-checking-the-login-function-using-valid-username-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enter the valid username \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enter the valid password \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user confirm it navigates to the  homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product;user-checking-the-login-function-using-valid-username-and-valid-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product;user-checking-the-login-function-using-valid-username-and-valid-password;;1"
    },
    {
      "cells": [
        "lesakki24@gmail.com",
        "India@2070"
      ],
      "line": 19,
      "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product;user-checking-the-login-function-using-valid-username-and-valid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "user checking the login function using valid username and valid password",
  "description": "",
  "id": "testing-logical-functionality-of-placing-the-order-of-a-product-and-returing-of-the-product;user-checking-the-login-function-using-valid-username-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enter the valid username \"lesakki24@gmail.com\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enter the valid password \"India@2070\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user confirm it navigates to the  homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 15013207400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lesakki24@gmail.com",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username_in_username_field(String)"
});
formatter.result({
  "duration": 2030251600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India@2070",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password_in_password_field(String)"
});
formatter.result({
  "duration": 713565600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 252398499,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_confirm_it_navigates_to_the_homepage()"
});
formatter.result({
  "duration": 35900,
  "status": "passed"
});
});